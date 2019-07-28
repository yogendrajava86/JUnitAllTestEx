package com.app.dev;
import static com.app.util.PropertiesFile.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	private static Connection con=null;
	static {
		try {
			Class.forName(getProperties().getProperty("dc"));
			con=DriverManager.getConnection(getProperties().getProperty("url"),getProperties().getProperty("un"),getProperties().getProperty("pwd"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getSingletonConnection() {
		return con;
	}
}
