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
package com.antsdb.saltedfish.server.mysql.util;

/**
 * @author mycat
 */
public interface MysqlErrorCode {

    // mycat error code
    public static final int ERR_BAD_LOGICDB = 3000;
    public static final int ERR_OPEN_SOCKET = 3001;
    public static final int ERR_CONNECT_SOCKET = 3002;
    public static final int ERR_REGISTER = 3004;
    public static final int ERR_READ = 3005;
    public static final int ERR_PUT_WRITE_QUEUE = 3006;
    public static final int ERR_WRITE_BY_EVENT = 3007;
    public static final int ERR_WRITE_BY_QUEUE = 3008;
    public static final int ERR_HANDLE_DATA = 3009;
    public static final int ERR_NOT_SUPPORTED = 3010;
    public static final int ERR_MULTI_NODE_FAILED = 3011;
    public static final int ERR_WRONG_USED = 3012;
    public static final int ERR_FOUND_EXCEPION = 3344;
    // mycat error code
    public static final int ER_HASHCHK = 1000;
    public static final int ER_NISAMCHK = 1001;
    public static final int ER_NO = 1002;
    public static final int ER_YES = 1003;
    public static final int ER_CANT_CREATE_FILE = 1004;
    public static final int ER_CANT_CREATE_TABLE = 1005;
    public static final int ER_CANT_CREATE_DB = 1006;
    public static final int ER_DB_CREATE_EXISTS = 1007;
    public static final int ER_DB_DROP_EXISTS = 1008;
    public static final int ER_DB_DROP_DELETE = 1009;
    public static final int ER_DB_DROP_RMDIR = 1010;
    public static final int ER_CANT_DELETE_FILE = 1011;
    public static final int ER_CANT_FIND_SYSTEM_REC = 1012;
    public static final int ER_CANT_GET_STAT = 1013;
    public static final int ER_CANT_GET_WD = 1014;
    public static final int ER_CANT_LOCK = 1015;
    public static final int ER_CANT_OPEN_FILE = 1016;
    public static final int ER_FILE_NOT_FOUND = 1017;
    public static final int ER_CANT_READ_DIR = 1018;
    public static final int ER_CANT_SET_WD = 1019;
    public static final int ER_CHECKREAD = 1020;
    public static final int ER_DISK_FULL = 1021;
    public static final int ER_DUP_KEY = 1022;
    public static final int ER_ERROR_ON_CLOSE = 1023;
    public static final int ER_ERROR_ON_READ = 1024;
    public static final int ER_ERROR_ON_RENAME = 1025;
    public static final int ER_ERROR_ON_WRITE = 1026;
    public static final int ER_FILE_USED = 1027;
    public static final int ER_FILSORT_ABORT = 1028;
    public static final int ER_FORM_NOT_FOUND = 1029;
    public static final int ER_GET_ERRNO = 1030;
    public static final int ER_ILLEGAL_HA = 1031;
    public static final int ER_KEY_NOT_FOUND = 1032;
    public static final int ER_NOT_FORM_FILE = 1033;
    public static final int ER_NOT_KEYFILE = 1034;
    public static final int ER_OLD_KEYFILE = 1035;
    public static final int ER_OPEN_AS_READONLY = 1036;
    public static final int ER_OUTOFMEMORY = 1037;
    public static final int ER_OUT_OF_SORTMEMORY = 1038;
    public static final int ER_UNEXPECTED_EOF = 1039;
    public static final int ER_CON_COUNT_ERROR = 1040;
    public static final int ER_OUT_OF_RESOURCES = 1041;
    public static final int ER_BAD_HOST_ERROR = 1042;
    public static final int ER_HANDSHAKE_ERROR = 1043;
    public static final int ER_DBACCESS_DENIED_ERROR = 1044;
    public static final int ER_ACCESS_DENIED_ERROR = 1045;
    public static final int ER_NO_DB_ERROR = 1046;
    public static final int ER_UNKNOWN_COM_ERROR = 1047;
    public static final int ER_BAD_NULL_ERROR = 1048;
    public static final int ER_BAD_DB_ERROR = 1049;
    public static final int ER_TABLE_EXISTS_ERROR = 1050;
    public static final int ER_BAD_TABLE_ERROR = 1051;
    public static final int ER_NON_UNIQ_ERROR = 1052;
    public static final int ER_SERVER_SHUTDOWN = 1053;
    public static final int ER_BAD_FIELD_ERROR = 1054;
    public static final int ER_WRONG_FIELD_WITH_GROUP = 1055;
    public static final int ER_WRONG_GROUP_FIELD = 1056;
    public static final int ER_WRONG_SUM_SELECT = 1057;
    public static final int ER_WRONG_VALUE_COUNT = 1058;
    public static final int ER_TOO_LONG_IDENT = 1059;
    public static final int ER_DUP_FIELDNAME = 1060;
    public static final int ER_DUP_KEYNAME = 1061;
    public static final int ER_DUP_ENTRY = 1062;
    public static final int ER_WRONG_FIELD_SPEC = 1063;
    public static final int ER_PARSE_ERROR = 1064;
    public static final int ER_EMPTY_QUERY = 1065;
    public static final int ER_NONUNIQ_TABLE = 1066;
    public static final int ER_INVALID_DEFAULT = 1067;
    public static final int ER_MULTIPLE_PRI_KEY = 1068;
    public static final int ER_TOO_MANY_KEYS = 1069;
    public static final int ER_TOO_MANY_KEY_PARTS = 1070;
    public static final int ER_TOO_LONG_KEY = 1071;
    public static final int ER_KEY_COLUMN_DOES_NOT_EXITS = 1072;
    public static final int ER_BLOB_USED_AS_KEY = 1073;
    public static final int ER_TOO_BIG_FIELDLENGTH = 1074;
    public static final int ER_WRONG_AUTO_KEY = 1075;
    public static final int ER_READY = 1076;
    public static final int ER_NORMAL_SHUTDOWN = 1077;
    public static final int ER_GOT_SIGNAL = 1078;
    public static final int ER_SHUTDOWN_COMPLETE = 1079;
    public static final int ER_FORCING_CLOSE = 1080;
    public static final int ER_IPSOCK_ERROR = 1081;
    public static final int ER_NO_SUCH_INDEX = 1082;
    public static final int ER_WRONG_FIELD_TERMINATORS = 1083;
    public static final int ER_BLOBS_AND_NO_TERMINATED = 1084;
    public static final int ER_TEXTFILE_NOT_READABLE = 1085;
    public static final int ER_FILE_EXISTS_ERROR = 1086;
    public static final int ER_LOAD_INFO = 1087;
    public static final int ER_ALTER_INFO = 1088;
    public static final int ER_WRONG_SUB_KEY = 1089;
    public static final int ER_CANT_REMOVE_ALL_FIELDS = 1090;
    public static final int ER_CANT_DROP_FIELD_OR_KEY = 1091;
    public static final int ER_INSERT_INFO = 1092;
    public static final int ER_UPDATE_TABLE_USED = 1093;
    public static final int ER_NO_SUCH_THREAD = 1094;
    public static final int ER_KILL_DENIED_ERROR = 1095;
    public static final int ER_NO_TABLES_USED = 1096;
    public static final int ER_TOO_BIG_SET = 1097;
    public static final int ER_NO_UNIQUE_LOGFILE = 1098;
    public static final int ER_TABLE_NOT_LOCKED_FOR_WRITE = 1099;
    public static final int ER_TABLE_NOT_LOCKED = 1100;
    public static final int ER_BLOB_CANT_HAVE_DEFAULT = 1101;
    public static final int ER_WRONG_DB_NAME = 1102;
    public static final int ER_WRONG_TABLE_NAME = 1103;
    public static final int ER_TOO_BIG_SELECT = 1104;
    public static final int ER_UNKNOWN_ERROR = 1105;
    public static final int ER_UNKNOWN_PROCEDURE = 1106;
    public static final int ER_WRONG_PARAMCOUNT_TO_PROCEDURE = 1107;
    public static final int ER_WRONG_PARAMETERS_TO_PROCEDURE = 1108;
    public static final int ER_UNKNOWN_TABLE = 1109;
    public static final int ER_FIELD_SPECIFIED_TWICE = 1110;
    public static final int ER_INVALID_GROUP_FUNC_USE = 1111;
    public static final int ER_UNSUPPORTED_EXTENSION = 1112;
    public static final int ER_TABLE_MUST_HAVE_COLUMNS = 1113;
    public static final int ER_RECORD_FILE_FULL = 1114;
    public static final int ER_UNKNOWN_CHARACTER_SET = 1115;
    public static final int ER_TOO_MANY_TABLES = 1116;
    public static final int ER_TOO_MANY_FIELDS = 1117;
    public static final int ER_TOO_BIG_ROWSIZE = 1118;
    public static final int ER_STACK_OVERRUN = 1119;
    public static final int ER_WRONG_OUTER_JOIN = 1120;
    public static final int ER_NULL_COLUMN_IN_INDEX = 1121;
    public static final int ER_CANT_FIND_UDF = 1122;
    public static final int ER_CANT_INITIALIZE_UDF = 1123;
    public static final int ER_UDF_NO_PATHS = 1124;
    public static final int ER_UDF_EXISTS = 1125;
    public static final int ER_CANT_OPEN_LIBRARY = 1126;
    public static final int ER_CANT_FIND_DL_ENTRY = 1127;
    public static final int ER_FUNCTION_NOT_DEFINED = 1128;
    public static final int ER_HOST_IS_BLOCKED = 1129;
    public static final int ER_HOST_NOT_PRIVILEGED = 1130;
    public static final int ER_PASSWORD_ANONYMOUS_USER = 1131;
    public static final int ER_PASSWORD_NOT_ALLOWED = 1132;
    public static final int ER_PASSWORD_NO_MATCH = 1133;
    public static final int ER_UPDATE_INFO = 1134;
    public static final int ER_CANT_CREATE_THREAD = 1135;
    public static final int ER_WRONG_VALUE_COUNT_ON_ROW = 1136;
    public static final int ER_CANT_REOPEN_TABLE = 1137;
    public static final int ER_INVALID_USE_OF_NULL = 1138;
    public static final int ER_REGEXP_ERROR = 1139;
    public static final int ER_MIX_OF_GROUP_FUNC_AND_FIELDS = 1140;
    public static final int ER_NONEXISTING_GRANT = 1141;
    public static final int ER_TABLEACCESS_DENIED_ERROR = 1142;
    public static final int ER_COLUMNACCESS_DENIED_ERROR = 1143;
    public static final int ER_ILLEGAL_GRANT_FOR_TABLE = 1144;
    public static final int ER_GRANT_WRONG_HOST_OR_USER = 1145;
    public static final int ER_NO_SUCH_TABLE = 1146;
    public static final int ER_NONEXISTING_TABLE_GRANT = 1147;
    public static final int ER_NOT_ALLOWED_COMMAND = 1148;
    public static final int ER_SYNTAX_ERROR = 1149;
    public static final int ER_DELAYED_CANT_CHANGE_LOCK = 1150;
    public static final int ER_TOO_MANY_DELAYED_THREADS = 1151;
    public static final int ER_ABORTING_CONNECTION = 1152;
    public static final int ER_NET_PACKET_TOO_LARGE = 1153;
    public static final int ER_NET_READ_ERROR_FROM_PIPE = 1154;
    public static final int ER_NET_FCNTL_ERROR = 1155;
    public static final int ER_NET_PACKETS_OUT_OF_ORDER = 1156;
    public static final int ER_NET_UNCOMPRESS_ERROR = 1157;
    public static final int ER_NET_READ_ERROR = 1158;
    public static final int ER_NET_READ_INTERRUPTED = 1159;
    public static final int ER_NET_ERROR_ON_WRITE = 1160;
    public static final int ER_NET_WRITE_INTERRUPTED = 1161;
    public static final int ER_TOO_LONG_STRING = 1162;
    public static final int ER_TABLE_CANT_HANDLE_BLOB = 1163;
    public static final int ER_TABLE_CANT_HANDLE_AUTO_INCREMENT = 1164;
    public static final int ER_DELAYED_INSERT_TABLE_LOCKED = 1165;
    public static final int ER_WRONG_COLUMN_NAME = 1166;
    public static final int ER_WRONG_KEY_COLUMN = 1167;
    public static final int ER_WRONG_MRG_TABLE = 1168;
    public static final int ER_DUP_UNIQUE = 1169;
    public static final int ER_BLOB_KEY_WITHOUT_LENGTH = 1170;
    public static final int ER_PRIMARY_CANT_HAVE_NULL = 1171;
    public static final int ER_TOO_MANY_ROWS = 1172;
    public static final int ER_REQUIRES_PRIMARY_KEY = 1173;
    public static final int ER_NO_RAID_COMPILED = 1174;
    public static final int ER_UPDATE_WITHOUT_KEY_IN_SAFE_MODE = 1175;
    public static final int ER_KEY_DOES_NOT_EXITS = 1176;
    public static final int ER_CHECK_NO_SUCH_TABLE = 1177;
    public static final int ER_CHECK_NOT_IMPLEMENTED = 1178;
    public static final int ER_CANT_DO_THIS_DURING_AN_TRANSACTION = 1179;
    public static final int ER_ERROR_DURING_COMMIT = 1180;
    public static final int ER_ERROR_DURING_ROLLBACK = 1181;
    public static final int ER_ERROR_DURING_FLUSH_LOGS = 1182;
    public static final int ER_ERROR_DURING_CHECKPOINT = 1183;
    public static final int ER_NEW_ABORTING_CONNECTION = 1184;
    public static final int ER_DUMP_NOT_IMPLEMENTED = 1185;
    public static final int ER_FLUSH_MASTER_BINLOG_CLOSED = 1186;
    public static final int ER_INDEX_REBUILD = 1187;
    public static final int ER_MASTER = 1188;
    public static final int ER_MASTER_NET_READ = 1189;
    public static final int ER_MASTER_NET_WRITE = 1190;
    public static final int ER_FT_MATCHING_KEY_NOT_FOUND = 1191;
    public static final int ER_LOCK_OR_ACTIVE_TRANSACTION = 1192;
    public static final int ER_UNKNOWN_SYSTEM_VARIABLE = 1193;
    public static final int ER_CRASHED_ON_USAGE = 1194;
    public static final int ER_CRASHED_ON_REPAIR = 1195;
    public static final int ER_WARNING_NOT_COMPLETE_ROLLBACK = 1196;
    public static final int ER_TRANS_CACHE_FULL = 1197;
    public static final int ER_SLAVE_MUST_STOP = 1198;
    public static final int ER_SLAVE_NOT_RUNNING = 1199;
    public static final int ER_BAD_SLAVE = 1200;
    public static final int ER_MASTER_INFO = 1201;
    public static final int ER_SLAVE_THREAD = 1202;
    public static final int ER_TOO_MANY_USER_CONNECTIONS = 1203;
    public static final int ER_SET_CONSTANTS_ONLY = 1204;
    public static final int ER_LOCK_WAIT_TIMEOUT = 1205;
    public static final int ER_LOCK_TABLE_FULL = 1206;
    public static final int ER_READ_ONLY_TRANSACTION = 1207;
    public static final int ER_DROP_DB_WITH_READ_LOCK = 1208;
    public static final int ER_CREATE_DB_WITH_READ_LOCK = 1209;
    public static final int ER_WRONG_ARGUMENTS = 1210;
    public static final int ER_NO_PERMISSION_TO_CREATE_USER = 1211;
    public static final int ER_UNION_TABLES_IN_DIFFERENT_DIR = 1212;
    public static final int ER_LOCK_DEADLOCK = 1213;
    public static final int ER_TABLE_CANT_HANDLE_FT = 1214;
    public static final int ER_CANNOT_ADD_FOREIGN = 1215;
    public static final int ER_NO_REFERENCED_ROW = 1216;
    public static final int ER_ROW_IS_REFERENCED = 1217;
    public static final int ER_CONNECT_TO_MASTER = 1218;
    public static final int ER_QUERY_ON_MASTER = 1219;
    public static final int ER_ERROR_WHEN_EXECUTING_COMMAND = 1220;
    public static final int ER_WRONG_USAGE = 1221;
    public static final int ER_WRONG_NUMBER_OF_COLUMNS_IN_SELECT = 1222;
    public static final int ER_CANT_UPDATE_WITH_READLOCK = 1223;
    public static final int ER_MIXING_NOT_ALLOWED = 1224;
    public static final int ER_DUP_ARGUMENT = 1225;
    public static final int ER_USER_LIMIT_REACHED = 1226;
    public static final int ER_SPECIFIC_ACCESS_DENIED_ERROR = 1227;
    public static final int ER_LOCAL_VARIABLE = 1228;
    public static final int ER_GLOBAL_VARIABLE = 1229;
    public static final int ER_NO_DEFAULT = 1230;
    public static final int ER_WRONG_VALUE_FOR_VAR = 1231;
    public static final int ER_WRONG_TYPE_FOR_VAR = 1232;
    public static final int ER_VAR_CANT_BE_READ = 1233;
    public static final int ER_CANT_USE_OPTION_HERE = 1234;
    public static final int ER_NOT_SUPPORTED_YET = 1235;
    public static final int ER_MASTER_FATAL_ERROR_READING_BINLOG = 1236;
    public static final int ER_SLAVE_IGNORED_TABLE = 1237;
    public static final int ER_INCORRECT_GLOBAL_LOCAL_VAR = 1238;
    public static final int ER_WRONG_FK_DEF = 1239;
    public static final int ER_KEY_REF_DO_NOT_MATCH_TABLE_REF = 1240;
    public static final int ER_OPERAND_COLUMNS = 1241;
    public static final int ER_SUBQUERY_NO_1_ROW = 1242;
    public static final int ER_UNKNOWN_STMT_HANDLER = 1243;
    public static final int ER_CORRUPT_HELP_DB = 1244;
    public static final int ER_CYCLIC_REFERENCE = 1245;
    public static final int ER_AUTO_CONVERT = 1246;
    public static final int ER_ILLEGAL_REFERENCE = 1247;
    public static final int ER_DERIVED_MUST_HAVE_ALIAS = 1248;
    public static final int ER_SELECT_REDUCED = 1249;
    public static final int ER_TABLENAME_NOT_ALLOWED_HERE = 1250;
    public static final int ER_NOT_SUPPORTED_AUTH_MODE = 1251;
    public static final int ER_SPATIAL_CANT_HAVE_NULL = 1252;
    public static final int ER_COLLATION_CHARSET_MISMATCH = 1253;
    public static final int ER_SLAVE_WAS_RUNNING = 1254;
    public static final int ER_SLAVE_WAS_NOT_RUNNING = 1255;
    public static final int ER_TOO_BIG_FOR_UNCOMPRESS = 1256;
    public static final int ER_ZLIB_Z_MEM_ERROR = 1257;
    public static final int ER_ZLIB_Z_BUF_ERROR = 1258;
    public static final int ER_ZLIB_Z_DATA_ERROR = 1259;
    public static final int ER_CUT_VALUE_GROUP_CONCAT = 1260;
    public static final int ER_WARN_TOO_FEW_RECORDS = 1261;
    public static final int ER_WARN_TOO_MANY_RECORDS = 1262;
    public static final int ER_WARN_NULL_TO_NOTNULL = 1263;
    public static final int ER_WARN_DATA_OUT_OF_RANGE = 1264;
    public static final int WARN_DATA_TRUNCATED = 1265;
    public static final int ER_WARN_USING_OTHER_HANDLER = 1266;
    public static final int ER_CANT_AGGREGATE_2COLLATIONS = 1267;
    public static final int ER_DROP_USER = 1268;
    public static final int ER_REVOKE_GRANTS = 1269;
    public static final int ER_CANT_AGGREGATE_3COLLATIONS = 1270;
    public static final int ER_CANT_AGGREGATE_NCOLLATIONS = 1271;
    public static final int ER_VARIABLE_IS_NOT_STRUCT = 1272;
    public static final int ER_UNKNOWN_COLLATION = 1273;
    public static final int ER_SLAVE_IGNORED_SSL_PARAMS = 1274;
    public static final int ER_SERVER_IS_IN_SECURE_AUTH_MODE = 1275;
    public static final int ER_WARN_FIELD_RESOLVED = 1276;
    public static final int ER_BAD_SLAVE_UNTIL_COND = 1277;
    public static final int ER_MISSING_SKIP_SLAVE = 1278;
    public static final int ER_UNTIL_COND_IGNORED = 1279;
    public static final int ER_WRONG_NAME_FOR_INDEX = 1280;
    public static final int ER_WRONG_NAME_FOR_CATALOG = 1281;
    public static final int ER_WARN_QC_RESIZE = 1282;
    public static final int ER_BAD_FT_COLUMN = 1283;
    public static final int ER_UNKNOWN_KEY_CACHE = 1284;
    public static final int ER_WARN_HOSTNAME_WONT_WORK = 1285;
    public static final int ER_UNKNOWN_STORAGE_ENGINE = 1286;
    public static final int ER_WARN_DEPRECATED_SYNTAX = 1287;
    public static final int ER_NON_UPDATABLE_TABLE = 1288;
    public static final int ER_FEATURE_DISABLED = 1289;
    public static final int ER_OPTION_PREVENTS_STATEMENT = 1290;
    public static final int ER_DUPLICATED_VALUE_IN_TYPE = 1291;
    public static final int ER_TRUNCATED_WRONG_VALUE = 1292;
    public static final int ER_TOO_MUCH_AUTO_TIMESTAMP_COLS = 1293;
    public static final int ER_INVALID_ON_UPDATE = 1294;
    public static final int ER_UNSUPPORTED_PS = 1295;
    public static final int ER_GET_ERRMSG = 1296;
    public static final int ER_GET_TEMPORARY_ERRMSG = 1297;
    public static final int ER_UNKNOWN_TIME_ZONE = 1298;
    public static final int ER_WARN_INVALID_TIMESTAMP = 1299;
    public static final int ER_INVALID_CHARACTER_STRING = 1300;
    public static final int ER_WARN_ALLOWED_PACKET_OVERFLOWED = 1301;
    public static final int ER_CONFLICTING_DECLARATIONS = 1302;
    public static final int ER_SP_NO_RECURSIVE_CREATE = 1303;
    public static final int ER_SP_ALREADY_EXISTS = 1304;
    public static final int ER_SP_DOES_NOT_EXIST = 1305;
    public static final int ER_SP_DROP_FAILED = 1306;
    public static final int ER_SP_STORE_FAILED = 1307;
    public static final int ER_SP_LILABEL_MISMATCH = 1308;
    public static final int ER_SP_LABEL_REDEFINE = 1309;
    public static final int ER_SP_LABEL_MISMATCH = 1310;
    public static final int ER_SP_UNINIT_VAR = 1311;
    public static final int ER_SP_BADSELECT = 1312;
    public static final int ER_SP_BADRETURN = 1313;
    public static final int ER_SP_BADSTATEMENT = 1314;
    public static final int ER_UPDATE_LOG_DEPRECATED_IGNORED = 1315;
    public static final int ER_UPDATE_LOG_DEPRECATED_TRANSLATED = 1316;
    public static final int ER_QUERY_INTERRUPTED = 1317;
    public static final int ER_SP_WRONG_NO_OF_ARGS = 1318;
    public static final int ER_SP_COND_MISMATCH = 1319;
    public static final int ER_SP_NORETURN = 1320;
    public static final int ER_SP_NORETURNEND = 1321;
    public static final int ER_SP_BAD_CURSOR_QUERY = 1322;
    public static final int ER_SP_BAD_CURSOR_SELECT = 1323;
    public static final int ER_SP_CURSOR_MISMATCH = 1324;
    public static final int ER_SP_CURSOR_ALREADY_OPEN = 1325;
    public static final int ER_SP_CURSOR_NOT_OPEN = 1326;
    public static final int ER_SP_UNDECLARED_VAR = 1327;
    public static final int ER_SP_WRONG_NO_OF_FETCH_ARGS = 1328;
    public static final int ER_SP_FETCH_NO_DATA = 1329;
    public static final int ER_SP_DUP_PARAM = 1330;
    public static final int ER_SP_DUP_VAR = 1331;
    public static final int ER_SP_DUP_COND = 1332;
    public static final int ER_SP_DUP_CURS = 1333;
    public static final int ER_SP_CANT_ALTER = 1334;
    public static final int ER_SP_SUBSELECT_NYI = 1335;
    public static final int ER_STMT_NOT_ALLOWED_IN_SF_OR_TRG = 1336;
    public static final int ER_SP_VARCOND_AFTER_CURSHNDLR = 1337;
    public static final int ER_SP_CURSOR_AFTER_HANDLER = 1338;
    public static final int ER_SP_CASE_NOT_FOUND = 1339;
    public static final int ER_FPARSER_TOO_BIG_FILE = 1340;
    public static final int ER_FPARSER_BAD_HEADER = 1341;
    public static final int ER_FPARSER_EOF_IN_COMMENT = 1342;
    public static final int ER_FPARSER_ERROR_IN_PARAMETER = 1343;
    public static final int ER_FPARSER_EOF_IN_UNKNOWN_PARAMETER = 1344;
    public static final int ER_VIEW_NO_EXPLAIN = 1345;
    public static final int ER_FRM_UNKNOWN_TYPE = 1346;
    public static final int ER_WRONG_OBJECT = 1347;
    public static final int ER_NONUPDATEABLE_COLUMN = 1348;
    public static final int ER_VIEW_SELECT_DERIVED = 1349;
    public static final int ER_VIEW_SELECT_CLAUSE = 1350;
    public static final int ER_VIEW_SELECT_VARIABLE = 1351;
    public static final int ER_VIEW_SELECT_TMPTABLE = 1352;
    public static final int ER_VIEW_WRONG_LIST = 1353;
    public static final int ER_WARN_VIEW_MERGE = 1354;
    public static final int ER_WARN_VIEW_WITHOUT_KEY = 1355;
    public static final int ER_VIEW_INVALID = 1356;
    public static final int ER_SP_NO_DROP_SP = 1357;
    public static final int ER_SP_GOTO_IN_HNDLR = 1358;
    public static final int ER_TRG_ALREADY_EXISTS = 1359;
    public static final int ER_TRG_DOES_NOT_EXIST = 1360;
    public static final int ER_TRG_ON_VIEW_OR_TEMP_TABLE = 1361;
    public static final int ER_TRG_CANT_CHANGE_ROW = 1362;
    public static final int ER_TRG_NO_SUCH_ROW_IN_TRG = 1363;
    public static final int ER_NO_DEFAULT_FOR_FIELD = 1364;
    public static final int ER_DIVISION_BY_ZERO = 1365;
    public static final int ER_TRUNCATED_WRONG_VALUE_FOR_FIELD = 1366;
    public static final int ER_ILLEGAL_VALUE_FOR_TYPE = 1367;
    public static final int ER_VIEW_NONUPD_CHECK = 1368;
    public static final int ER_VIEW_CHECK_FAILED = 1369;
    public static final int ER_PROCACCESS_DENIED_ERROR = 1370;
    public static final int ER_RELAY_LOG_FAIL = 1371;
    public static final int ER_PASSWD_LENGTH = 1372;
    public static final int ER_UNKNOWN_TARGET_BINLOG = 1373;
    public static final int ER_IO_ERR_LOG_INDEX_READ = 1374;
    public static final int ER_BINLOG_PURGE_PROHIBITED = 1375;
    public static final int ER_FSEEK_FAIL = 1376;
    public static final int ER_BINLOG_PURGE_FATAL_ERR = 1377;
    public static final int ER_LOG_IN_USE = 1378;
    public static final int ER_LOG_PURGE_UNKNOWN_ERR = 1379;
    public static final int ER_RELAY_LOG_INIT = 1380;
    public static final int ER_NO_BINARY_LOGGING = 1381;
    public static final int ER_RESERVED_SYNTAX = 1382;
    public static final int ER_WSAS_FAILED = 1383;
    public static final int ER_DIFF_GROUPS_PROC = 1384;
    public static final int ER_NO_GROUP_FOR_PROC = 1385;
    public static final int ER_ORDER_WITH_PROC = 1386;
    public static final int ER_LOGGING_PROHIBIT_CHANGING_OF = 1387;
    public static final int ER_NO_FILE_MAPPING = 1388;
    public static final int ER_WRONG_MAGIC = 1389;
    public static final int ER_PS_MANY_PARAM = 1390;
    public static final int ER_KEY_PART_0 = 1391;
    public static final int ER_VIEW_CHECKSUM = 1392;
    public static final int ER_VIEW_MULTIUPDATE = 1393;
    public static final int ER_VIEW_NO_INSERT_FIELD_LIST = 1394;
    public static final int ER_VIEW_DELETE_MERGE_VIEW = 1395;
    public static final int ER_CANNOT_USER = 1396;
    public static final int ER_XAER_NOTA = 1397;
    public static final int ER_XAER_INVAL = 1398;
    public static final int ER_XAER_RMFAIL = 1399;
    public static final int ER_XAER_OUTSIDE = 1400;
    public static final int ER_XAER_RMERR = 1401;
    public static final int ER_XA_RBROLLBACK = 1402;
    public static final int ER_NONEXISTING_PROC_GRANT = 1403;
    public static final int ER_PROC_AUTO_GRANT_FAIL = 1404;
    public static final int ER_PROC_AUTO_REVOKE_FAIL = 1405;
    public static final int ER_DATA_TOO_LONG = 1406;
    public static final int ER_SP_BAD_SQLSTATE = 1407;
    public static final int ER_STARTUP = 1408;
    public static final int ER_LOAD_FROM_FIXED_SIZE_ROWS_TO_VAR = 1409;
    public static final int ER_CANT_CREATE_USER_WITH_GRANT = 1410;
    public static final int ER_WRONG_VALUE_FOR_TYPE = 1411;
    public static final int ER_TABLE_DEF_CHANGED = 1412;
    public static final int ER_SP_DUP_HANDLER = 1413;
    public static final int ER_SP_NOT_VAR_ARG = 1414;
    public static final int ER_SP_NO_RETSET = 1415;
    public static final int ER_CANT_CREATE_GEOMETRY_OBJECT = 1416;
    public static final int ER_FAILED_ROUTINE_BREAK_BINLOG = 1417;
    public static final int ER_BINLOG_UNSAFE_ROUTINE = 1418;
    public static final int ER_BINLOG_CREATE_ROUTINE_NEED_SUPER = 1419;
    public static final int ER_EXEC_STMT_WITH_OPEN_CURSOR = 1420;
    public static final int ER_STMT_HAS_NO_OPEN_CURSOR = 1421;
    public static final int ER_COMMIT_NOT_ALLOWED_IN_SF_OR_TRG = 1422;
    public static final int ER_NO_DEFAULT_FOR_VIEW_FIELD = 1423;
    public static final int ER_SP_NO_RECURSION = 1424;
    public static final int ER_TOO_BIG_SCALE = 1425;
    public static final int ER_TOO_BIG_PRECISION = 1426;
    public static final int ER_M_BIGGER_THAN_D = 1427;
    public static final int ER_WRONG_LOCK_OF_SYSTEM_TABLE = 1428;
    public static final int ER_CONNECT_TO_FOREIGN_DATA_SOURCE = 1429;
    public static final int ER_QUERY_ON_FOREIGN_DATA_SOURCE = 1430;
    public static final int ER_FOREIGN_DATA_SOURCE_DOESNT_EXIST = 1431;
    public static final int ER_FOREIGN_DATA_STRING_INVALID_CANT_CREATE = 1432;
    public static final int ER_FOREIGN_DATA_STRING_INVALID = 1433;
    public static final int ER_CANT_CREATE_FEDERATED_TABLE = 1434;
    public static final int ER_TRG_IN_WRONG_SCHEMA = 1435;
    public static final int ER_STACK_OVERRUN_NEED_MORE = 1436;
    public static final int ER_TOO_LONG_BODY = 1437;
    public static final int ER_WARN_CANT_DROP_DEFAULT_KEYCACHE = 1438;
    public static final int ER_TOO_BIG_DISPLAYWIDTH = 1439;
    public static final int ER_XAER_DUPID = 1440;
    public static final int ER_DATETIME_FUNCTION_OVERFLOW = 1441;
    public static final int ER_CANT_UPDATE_USED_TABLE_IN_SF_OR_TRG = 1442;
    public static final int ER_VIEW_PREVENT_UPDATE = 1443;
    public static final int ER_PS_NO_RECURSION = 1444;
    public static final int ER_SP_CANT_SET_AUTOCOMMIT = 1445;
    public static final int ER_NO_VIEW_USER = 1446;
    public static final int ER_VIEW_FRM_NO_USER = 1447;
    public static final int ER_VIEW_OTHER_USER = 1448;
    public static final int ER_NO_SUCH_USER = 1449;
    public static final int ER_FORBID_SCHEMA_CHANGE = 1450;
    public static final int ER_ROW_IS_REFERENCED_2 = 1451;
    public static final int ER_NO_REFERENCED_ROW_2 = 1452;
    public static final int ER_SP_BAD_VAR_SHADOW = 1453;
    public static final int ER_PARTITION_REQUIRES_VALUES_ERROR = 1454;
    public static final int ER_PARTITION_WRONG_VALUES_ERROR = 1455;
    public static final int ER_PARTITION_MAXVALUE_ERROR = 1456;
    public static final int ER_PARTITION_SUBPARTITION_ERROR = 1457;
    public static final int ER_PARTITION_WRONG_NO_PART_ERROR = 1458;
    public static final int ER_PARTITION_WRONG_NO_SUBPART_ERROR = 1459;
    public static final int ER_CONST_EXPR_IN_PARTITION_FUNC_ERROR = 1460;
    public static final int ER_NO_CONST_EXPR_IN_RANGE_OR_LIST_ERROR = 1461;
    public static final int ER_FIELD_NOT_FOUND_PART_ERROR = 1462;
    public static final int ER_LIST_OF_FIELDS_ONLY_IN_HASH_ERROR = 1463;
    public static final int ER_INCONSISTENT_PARTITION_INFO_ERROR = 1464;
    public static final int ER_PARTITION_FUNC_NOT_ALLOWED_ERROR = 1465;
    public static final int ER_PARTITIONS_MUST_BE_DEFINED_ERROR = 1466;
    public static final int ER_RANGE_NOT_INCREASING_ERROR = 1467;
    public static final int ER_INCONSISTENT_TYPE_OF_FUNCTIONS_ERROR = 1468;
    public static final int ER_MULTIPLE_DEF_CONST_IN_LIST_PART_ERROR = 1469;
    public static final int ER_PARTITION_ENTRY_ERROR = 1470;
    public static final int ER_MIX_HANDLER_ERROR = 1471;
    public static final int ER_PARTITION_NOT_DEFINED_ERROR = 1472;
    public static final int ER_TOO_MANY_PARTITIONS_ERROR = 1473;
    public static final int ER_SUBPARTITION_ERROR = 1474;
    public static final int ER_CANT_CREATE_HANDLER_FILE = 1475;
    public static final int ER_BLOB_FIELD_IN_PART_FUNC_ERROR = 1476;
    public static final int ER_CHAR_SET_IN_PART_FIELD_ERROR = 1477;
    public static final int ER_UNIQUE_KEY_NEED_ALL_FIELDS_IN_PF = 1478;
    public static final int ER_NO_PARTS_ERROR = 1479;
    public static final int ER_PARTITION_MGMT_ON_NONPARTITIONED = 1480;
    public static final int ER_DROP_PARTITION_NON_EXISTENT = 1481;
    public static final int ER_DROP_LAST_PARTITION = 1482;
    public static final int ER_COALESCE_ONLY_ON_HASH_PARTITION = 1483;
    public static final int ER_ONLY_ON_RANGE_LIST_PARTITION = 1484;
    public static final int ER_ADD_PARTITION_SUBPART_ERROR = 1485;
    public static final int ER_ADD_PARTITION_NO_NEW_PARTITION = 1486;
    public static final int ER_COALESCE_PARTITION_NO_PARTITION = 1487;
    public static final int ER_REORG_PARTITION_NOT_EXIST = 1488;
    public static final int ER_SAME_NAME_PARTITION = 1489;
    public static final int ER_CONSECUTIVE_REORG_PARTITIONS = 1490;
    public static final int ER_REORG_OUTSIDE_RANGE = 1491;
    public static final int ER_DROP_PARTITION_FAILURE = 1492;
    public static final int ER_DROP_PARTITION_WHEN_FK_DEFINED = 1493;
    public static final int ER_PLUGIN_IS_NOT_LOADED = 1494;
    public static final int ER_USER_READ_ONLY = 1495;

}