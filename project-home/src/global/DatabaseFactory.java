package global;

import java.util.Scanner;
import java.awt.Container;
import java.sql.Date;

public class DatabaseFactory {
	public static Database getDatabase(Vendor vendor, String id, String pass) {
		// �ڵ� �ϼ�
		Scanner scanner = new Scanner(System.in);

		String driver = null;
		String url = null;
		
		switch (vendor) {
		case ORACLE: 
			driver = Constants.ORACLE_DRIVER;
			url = Constants.ORACLE_URL;
			break; 
		case MSSQL: 
			driver = Constants.MSSQL_DRIVER;
			url = Constants.MSSQL_URL;
			break;
		case MYSQL: 
			driver = Constants.MYSQL_DRIVER;
			url = Constants.MYSQL_URL;
			break;
		default:
			break;
		}
		return new DatabaseImpl(driver, url, id, pass);
	}


}
