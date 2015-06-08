package fh.prog.lab.it.samples.dbServices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class newselect {

	Statement stmt = null;
	ResultSet rs = null;
	Connection conn = null;
	ResultSetMetaData meta = null;
	int count = 0;
	
	public newselect(Connection conn,String table) throws SQLException {
		
		this.conn = conn;
		String query = "Select * from" + table;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		meta = rs.getMetaData();
		count = meta.getColumnCount();
	}
	
	public Vector getColumnNames() throws SQLException{
		Vector<String> columnName = new Vector<String>();
		for (int i = 1; i < count; i++) {
			columnName.add(this.meta.getColumnName(i));
		}
		return columnName;
	}
	
	public Vector getData() throws SQLException{
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		while (rs.next()) {
			Vector<Object> inhalt = new Vector<Object>();
			for (int i = 1; i < count; i++) {
				inhalt.add(rs.getObject(i));
			}
			data.add(inhalt);
		}
		return data;
	}
}
