package fh.prog.lab.it.samples.dbServices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class newselect {
	Select sel = new Select(new DBServicesInvoker().conn);
	ResultSet res = null;
	
	/*
	 * Speichert die Spaltennamen als Vector und liefert Sie zurück
	 * @param String table name
	 * Furkan Yücel
	 */
	public Vector getColumnNames(String table) throws SQLException{
		Vector<String> name = new Vector<String>();
		int colCounter = 0;
		res = sel.stmt.executeQuery("select * from " + table);
		ResultSetMetaData data = res.getMetaData();
		colCounter = data.getColumnCount();
		for (int i = 0; i < colCounter; i++) {
			name.add(data.getColumnName(i+1));
		}
		
		return name; 
	}
	
	public Vector getData(String table) throws SQLException{
		int i = 0;
		Vector<String> data = new Vector<String>();
		
		res = sel.stmt.executeQuery("select * from" + table);
		ResultSetMetaData dat = res.getMetaData();
		while (res.next()) {
			data.add(res.getNString(i+1));
			i++;
		}
		return data;
		
	}
}
