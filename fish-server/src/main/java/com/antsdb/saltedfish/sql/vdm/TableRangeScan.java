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
package com.antsdb.saltedfish.sql.vdm;

import java.util.List;

import com.antsdb.saltedfish.cpp.BluntHeap;
import com.antsdb.saltedfish.cpp.FishBoundary;
import com.antsdb.saltedfish.nosql.GTable;
import com.antsdb.saltedfish.nosql.RowIterator;
import com.antsdb.saltedfish.sql.meta.ColumnMeta;
import com.antsdb.saltedfish.sql.meta.TableMeta;

public class TableRangeScan extends CursorMaker implements RangeScannable, Ordered {
    Vector from;
    Vector to;
    Operator exprFrom;
    Operator exprTo;
    CursorMeta meta;
    int[] mapping;
    TableMeta table;

    public TableRangeScan(TableMeta table, int makerId) {
        this.table = table;
        this.meta = CursorMeta.from(table);
        this.mapping = this.meta.getHumpbackMapping();
        setMakerId(makerId);
    }
    
    @Override
    public CursorMeta getCursorMeta() {
        return meta;
    }

    @Override
    public Object run(VdmContext ctx, Parameters params, long pMaster) {
        if ((this.from == null) && (this.to == null)) {
            return null;
        }
        try (BluntHeap heap = new BluntHeap()) {
	        long pKeyFrom = 0;
	        boolean fromInclusive = true;
	        if (this.from != null) {
	        	long pFrom = this.exprFrom.eval(ctx, heap, params, pMaster);
	        	if (pFrom == 0) {
	        		return new EmptyCursor(meta);
	        	}
	        	FishBoundary from = FishBoundary.create(pFrom);
	        	pKeyFrom = from.getKeyAddress();
	        	fromInclusive = from.isInclusive();
	        }
	        long pKeyTo = 0;
	        boolean toInclusive = true;
	        if (this.to != null) {
	            long pTo = this.exprTo.eval(ctx, heap, params, pMaster);
	        	if (pTo == 0) {
	        		return new EmptyCursor(meta);
	        	}
		        FishBoundary to = FishBoundary.create(pTo);
		        pKeyTo = to.getKeyAddress();
		        toInclusive = to.isInclusive();
	        }
	        GTable gtable = ctx.getHumpback().getTable(table.getId());
	        Transaction trx = ctx.getTransaction();
	        RowIterator it = gtable.scan(
	                trx.getTrxId(), 
	                trx.getTrxTs(),
	                pKeyFrom,
	                fromInclusive,
	                pKeyTo,
	                toInclusive,
	                true);
	        DumbCursor cursor = new DumbCursor(
	        		ctx.getSpaceManager(), 
	        		this.meta, 
	        		it, 
	        		mapping, 
	        		ctx.getCursorStats(makerId));
	        cursor.setName(this.toString());
	        return cursor;
        }
    }

    @Override
    public String toString() {
        return "Table Range Scan (" + this.table.getObjectName() + ")";
    }

    @Override
    public void explain(int level, List<ExplainRecord> records) {
        ExplainRecord rec = new ExplainRecord(level, toString());
        rec.setMakerId(makerId);
        records.add(rec);
    }

	@Override
	public void setFrom(Vector from) {
		this.from = from;
		this.exprFrom = new FuncGenerateKey(this.table.getKeyMaker(), from, false);
	}

	@Override
	public Vector getFrom() {
		return this.from;
	}

	@Override
	public void setTo(Vector to) {
		this.to = to;
		this.exprTo = new FuncGenerateKey(this.table.getKeyMaker(), to, true);
	}

	@Override
	public Vector getTo() {
		return this.to;
	}

	@Override
	public List<ColumnMeta> getOrder() {
		return this.table.getPrimaryKey().getColumns(table);
	}
}
