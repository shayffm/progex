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
	public Vector<String> getColumnNames(String table) throws SQLException{
		Vector<String> name = new Vector<String>();
		int colCounter = 0;
		/*
		 * Hier kommt der nicht in den Block rein.. Spuckt nullpointer exception aus 
		 */
		try {

			res = sel.doSelect(table);
			ResultSetMetaData data = res.getMetaData();
			colCounter = data.getColumnCount();
			for (int i = 0; i < colCounter; i++) {
				name.add(data.getColumnName(i+1));
			}
			
		} catch (Exception e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		return name; 
	}
	
	public Vector<String> getData(String table) throws SQLException{
		Vector<String> data = new Vector<String>();
		/*
		 * Hier kommt der nicht in den Block rein.. Spuckt nullpointer exception aus 
		 */
			try {
				
				res = sel.doSelect("Produkt");
				ResultSetMetaData dat = res.getMetaData();
				
				
			} catch (Exception e) {
				System.out.println("Fehler: " + e.getMessage());
			}
		
		return data;
		
	}
}
