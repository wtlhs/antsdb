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

import com.antsdb.saltedfish.sql.DataType;
import com.antsdb.saltedfish.sql.meta.ColumnMeta;
import com.antsdb.saltedfish.sql.meta.TableMeta;

public class CreateColumn extends Statement implements ColumnAttributes {
    public ObjectName tableName;
    public String columnName;
    public DataType type;
    public boolean nullable;
    public String defaultValue;
	public boolean autoIncrement = false;
    public String enumValues;
    
    @Override
    public Object run(VdmContext ctx, Parameters params) {
        // create metadata
        
        Transaction trx = ctx.getTransaction();
        TableMeta table = Checks.tableExist(ctx.getSession(), this.tableName);
        ColumnMeta columnMeta = new ColumnMeta(
                ctx.getOrca(), 
                trx.getTrxId(),
                table,
                this.columnName
                );
        
        columnMeta.setType(this.type);
        columnMeta.setNullable(this.nullable);
        columnMeta.setDefault(this.defaultValue);
        columnMeta.setTimeId(ctx.getOrca().getIdentityService().getTimeId());
        columnMeta.setAutoIncrement(this.autoIncrement);
        columnMeta.setEnumValues(this.enumValues);
        ctx.getOrca().getMetaService().addColumn(trx, columnMeta);
        
        // done
        
        return null;
    }

	@Override
	public String getColumnName() {
		return this.columnName;
	}

	@Override
	public ColumnAttributes setColumnName(String name) {
		this.columnName = name;
		return this;
	}

	@Override
	public DataType getType() {
		return this.type;
	}

	@Override
	public ColumnAttributes setType(DataType type) {
		this.type = type;
		return this;
	}

	@Override
	public boolean isNullable() {
		return this.nullable;
	}

	@Override
	public ColumnAttributes setNullable(boolean b) {
		this.nullable = b;
		return this;
	}

	@Override
	public String getDefaultValue() {
		return this.defaultValue;
	}

	@Override
	public ColumnAttributes setDefaultValue(String value) {
		this.defaultValue = value;
		return this;
	}

	@Override
	public boolean isAutoIncrement() {
		return this.isAutoIncrement();
	}

	@Override
	public ColumnAttributes setAutoIncrement(boolean value) {
		this.autoIncrement = value;
		return this;
	}

	public String getEnumValues() {
		return enumValues;
	}

	public void setEnumValues(String enumValues) {
		this.enumValues = enumValues;
	}

}
