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

import com.antsdb.saltedfish.cpp.FishObject;
import com.antsdb.saltedfish.cpp.Heap;
import com.antsdb.saltedfish.sql.DataType;

/**
 * 
 * @author wgu0
 */
public class FuncGroupConcat extends Function {
	int variableId;
	
    private static class Data {
    	String result;
    }
    
    public FuncGroupConcat(int variableId) {
    	this.variableId = variableId;
    }
    
    @Override
    public long eval(VdmContext ctx, Heap heap, Parameters params, long pRecord) {
    	// initialize 
    	
    	Data data = (Data)ctx.getVariable(this.variableId);
    	if (data == null) {
    		data = new Data();
    		ctx.setVariable(variableId, data);
    	}
        if (Record.isGroupEnd(pRecord)) {
            data.result = null;
            return 0;
        }
        long addrVal = this.parameters.get(0).eval(ctx, heap, params, pRecord);
        addrVal = AutoCaster.toString(heap, addrVal);
        String val = (String)FishObject.get(heap, addrVal);
        if (val != null) {
        	if (data.result == null) {
                data.result = val;
        	}
        	else {
                data.result += "," + val;
        	}
        }
        return FishObject.allocSet(heap, data.result);
    }

    @Override
    public DataType getReturnType() {
        return DataType.varchar();
    }
}
