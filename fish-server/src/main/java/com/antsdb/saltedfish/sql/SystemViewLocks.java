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
package com.antsdb.saltedfish.sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.antsdb.saltedfish.nosql.RowLockMonitor;
import com.antsdb.saltedfish.nosql.RowLockMonitor.RowLockInfo;
import com.antsdb.saltedfish.sql.vdm.Cursor;
import com.antsdb.saltedfish.sql.vdm.CursorMaker;
import com.antsdb.saltedfish.sql.vdm.CursorMeta;
import com.antsdb.saltedfish.sql.vdm.Parameters;
import com.antsdb.saltedfish.sql.vdm.VdmContext;
import com.antsdb.saltedfish.util.CursorUtil;

/**
 * 
 * @author wgu0
 */
public class SystemViewLocks extends CursorMaker {
	Orca orca;
	CursorMeta meta;
	
    public static class Item {
    	public long REQUEST_TRX_ID;
    	public long LOCK_TRX_ID;
    	public String FILE;
    	public long POS;
    }
    
	public SystemViewLocks(Orca orca) {
		this.orca = orca;
		meta = CursorUtil.toMeta(Item.class);
	}

	@Override
	public CursorMeta getCursorMeta() {
		return meta;
	}

	@Override
	public Object run(VdmContext ctx, Parameters params, long pMaster) {
		RowLockMonitor monitor = this.orca.getHumpback().getRowLockMonitor();
		monitor.start();
		try {
			Thread.sleep(2 * 1000);
		}
		catch (InterruptedException ignored) {
		}
		Map<Long, RowLockInfo> locks = monitor.end();
		List<Item> list = new ArrayList<>();
		for (RowLockInfo i:locks.values()) {
			list.add(add(i));
		}
		// done
        
        Cursor c = CursorUtil.toCursor(meta, list);
        return c;
	}

	private Item add(RowLockInfo lock) {
		Item item = new Item();
		item.REQUEST_TRX_ID = lock.requestTrxId;
		item.LOCK_TRX_ID = lock.lockTrxId;
		item.FILE = lock.file.toString();
		item.POS = lock.pos;
		return item;
	}
}
