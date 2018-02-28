package cn.jcloud.sso.common;

public class CommonData {
	
	public static String DB_ENCODED = "GBK";
	
	public static String STRING_NULL_VALUE = "";
	
	public static String SPLIT_CHAR = ",";
	
	public final static String SQL_PLACEHOLDER = "%s";
	
	public final static String SUCCESS_STRING = "0";

	public final static String FAIL_STRING = "1";
	
	public final static String VALIDATE_PARAM_FAIL_STRING = "98";
	
	public final static String VALIDATE_PARAM_FAIL_MESSAGE = "参数对应错误";
	
	public final static String VALIDATE_CLIENT_FAIL_STRING = "99";
	
	public final static String VALIDATE_CLIENT_FAIL_MESSAGE = "鉴权失败";
	
	public final static Integer SUCCESS = 1;

	public final static Integer FAIL = 0;
	
	public final static Integer VALIDATE_CLIENT_FAIL = 99;
	
	public final static int DB_TYPE_BIGINT = 13;
	public final static int DB_TYPE_BLOB = 43;
	public final static int DB_TYPE_CHAR = 1;
	public final static int DB_TYPE_CLOB = 41;
	public final static int DB_TYPE_DATE = 31;
	public final static int DB_TYPE_DECIMAL = 23;
	public final static int DB_TYPE_DOUBLE = 22;
	public final static int DB_TYPE_FLOAT = 21;
	public final static int DB_TYPE_INTEGER = 12;
	public final static int DB_TYPE_ORACLE_BINARY_DOUBLE = 101;
	public final static int DB_TYPE_ORACLE_BINARY_FLOAT = 100;
	public final static int DB_TYPE_SMALLINT = 11;
	public final static int DB_TYPE_TIME = 32;
	public final static int DB_TYPE_TIMESTAMP = 33;
	public final static int DB_TYPE_VARCHAR = 2;
	
	public final static String PROC_TYPE_IN = "0";
	public final static String PROC_TYPE_OUT = "1";
	
	public final static String MSG_TYPE_NEWUSER="newsapuser";
	public final static String MSG_TYPE_DELUSER="delsapuser";
	public final static String MSG_TYPE_DELROLE="delsaprole";
	
	public final static String SAPPWD_SUCCESS = "S";
}
