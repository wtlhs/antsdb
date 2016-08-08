/*-------------------------------------------------------------------------------------------------
 _______ __   _ _______ _______ ______  ______
 |_____| | \  |    |    |______ |     \ |_____]
 |     | |  \_|    |    ______| |_____/ |_____]

 Copyright (c) 2016, antsdb.com and/or its affiliates. All rights reserved. *-xguo0<@

 This program is free software: you can redistribute it and/or modify it under the terms of the
 GNU Affero General Public License, version 3, as published by the Free Software Foundation.

 You should have received a copy of the GNU Affero General Public License along with this program.
 If not, see <https://www.gnu.org/licenses/agpl-3.0.txt>
-------------------------------------------------------------------------------------------------*/
package com.antsdb.saltedfish.nosql;

import org.slf4j.Logger;

import com.antsdb.saltedfish.nosql.Gobbler.CommitEntry;
import com.antsdb.saltedfish.nosql.Gobbler.DeleteEntry;
import com.antsdb.saltedfish.nosql.Gobbler.IndexEntry;
import com.antsdb.saltedfish.nosql.Gobbler.PutEntry;
import com.antsdb.saltedfish.nosql.Gobbler.RollbackEntry;
import com.antsdb.saltedfish.util.UberUtil;

/**
 * 
 * @author wgu0
 */
class TrxRecoverer extends ReplayHandler {
	static Logger _log = UberUtil.getThisLogger();
	
	private TrxMan trxman;
	private long trxCount;
	private long oldesTrx = Long.MIN_VALUE;

	public void run(TrxMan trxMan, Gobbler gobbler, long spStart) throws Exception {
    	
    	// start recovering from the start given point
    	
		this.trxman = trxMan;
    	_log.info("start recovering trx from {} ...", spStart);
    	trxMan.setOldest(0);
    	long end = gobbler.replay(spStart, true, this);
    	_log.info("trx recovering stopped at {}", end);
    	
    	// ending
    	
    	_log.info("{} transactions have been recovered", this.trxCount);
    	if (oldesTrx != Long.MIN_VALUE) {
    		trxMan.setOldest(this.oldesTrx);
    	}
	}

	@Override
	public void commit(CommitEntry entry) throws Exception {
		this.trxCount++;
		long trxid = entry.getTrxid();
		if (trxid >= 0) {
			return;
		}
		long version = entry.getVersion();
		this.trxman.commit(trxid, version);
		this.oldesTrx = Math.max(this.oldesTrx, trxid);
	}

	@Override
	public void rollback(RollbackEntry entry) throws Exception {
		this.trxCount++;
		long trxid = entry.getTrxid();
		if (trxid >= 0) {
			return;
		}
		this.trxman.rollback(trxid);
		this.oldesTrx = Math.max(this.oldesTrx, trxid);
	}

	@Override
	public void put(PutEntry entry) throws Exception {
		long pRow = entry.getRowPointer();
		long trxid = Row.getVersion(pRow);
		if (trxid >= 0) {
			return;
		}
		this.trxman.rollback(trxid);
		this.oldesTrx = Math.max(this.oldesTrx, trxid);
	}

	@Override
	public void index(IndexEntry entry) throws Exception {
		long trxid = entry.getTrxid();
		if (trxid >= 0) {
			return;
		}
		this.trxman.rollback(trxid);
		this.oldesTrx = Math.max(this.oldesTrx, trxid);
	}

	@Override
	public void delete(DeleteEntry entry) throws Exception {
		long trxid = entry.getTrxid();
		if (trxid >= 0) {
			return;
		}
		this.trxman.rollback(trxid);
		this.oldesTrx = Math.max(this.oldesTrx, trxid);
	}
	
}
