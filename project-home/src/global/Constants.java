package global;

public class Constants {
	/*
	 * ����(Vendor: ���޾�ü) �� �����ϴ� low-level �� ���Ӱ�
	 */
	public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String ORACLE_ID = "hanbit";
	public static final String ORACLE_PASSWORD = "hanbit";
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_URL = "jdbc:mysql://localhost:3306/DB_NAME";
	public static final String MSSQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String MSSQL_URL = "jdbc:sqlserver://localhost:1433/DB_NAME";
	public static final String Maria_DRIVER = "org.mariadb.jdbc.Driver";
	public static final String Maria_URL = "jdbc:mariadb://localhost:3306/test_db";
	public static final String Mongo_DRIVER = "mongodb.jdbc.MongoDriver";
	public static final String Mongo_URL = "jdbc:mongo://ds029847.mongolab.com:29847/test_db";
}
