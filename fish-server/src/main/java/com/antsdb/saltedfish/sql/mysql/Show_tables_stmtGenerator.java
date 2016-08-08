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
package com.antsdb.saltedfish.sql.mysql;

import com.antsdb.saltedfish.lexer.MysqlParser.Show_tables_stmtContext;
import com.antsdb.saltedfish.sql.Generator;
import com.antsdb.saltedfish.sql.GeneratorContext;
import com.antsdb.saltedfish.sql.OrcaException;
import com.antsdb.saltedfish.sql.vdm.Instruction;

public class Show_tables_stmtGenerator extends Generator<Show_tables_stmtContext>{

    @Override
    public Instruction gen(GeneratorContext ctx, Show_tables_stmtContext rule) throws OrcaException {
        boolean isFull = (rule.K_FULL() != null);
        String ns = (rule.identifier() != null) ? Utils.getIdentifier(rule.identifier()) : null;
        ShowTables stmt = new ShowTables(ctx.getSession(), ns, isFull, Utils.getLiteralValue(rule.string_value()));
        return stmt;
    }

}
