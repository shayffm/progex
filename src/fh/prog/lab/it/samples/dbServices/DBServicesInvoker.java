/**
 * 
 */
package fh.prog.lab.it.samples.dbServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.System.out;

/**
 * @author NET
 *
 */
public class DBServicesInvoker {

	/**
	 * 
	 */
	//Credentials will be taken from here
	//******************************************
	private String urlPrefix = "jdbc:mysql://rdbms.strato.de";
	private String dbName = "DB2128589";
	private String dbTableName = "info";
	private String driver = "com.mysql.jdbc.Driver";
	private String userName = "U2128589";
	private String password ="Progex2015";
	private String port = "3306";
//	private String host = "127.0.0.1";
	//*******************************************
	public Connection conn = null;
	private String query = "select * from info";
	Statement stmt = null;
	ResultSet rs = null;
	
	public DBServicesInvoker() {

		try {
			
			openConnection();
		}catch (Exception e) {
			
			System.out.println("Error : " + e.getMessage());
		}
		
		
	}

	public void openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		
		//Structure of this statement="jdbc:mysql://127.0.0.1:3306/"
		String url = urlPrefix + ":" + port + "/";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url + dbName, userName, password);
	}
	public void getDB() throws SQLException{
		
		try {
			
			if(this.conn==null || this.conn.isClosed())
				openConnection();
			
			Select select = new Select(this.conn);
			select.doSelect("info");
			
			select.closeDB();
			
		} catch (Exception e) {
			
			System.out.println("IOError : " + e.getMessage());
		}
		
	}
	}
