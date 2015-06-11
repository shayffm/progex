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

			res = sel.stmt.executeQuery("select * from " + table);
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
				
				res = sel.stmt.executeQuery(sel.query);
				ResultSetMetaData dat = res.getMetaData();
				while (this.res.next()) {
					data.add(res.getString("Produkt-ID\n"));
					data.add(res.getString("Name\n"));
					data.add(res.getString("Versionsnummer\n"));
					data.add(res.getString("Listenpreis\n"));
					data.add(res.getString("Systemvoraussetzung\n"));
				}
			} catch (Exception e) {
				System.out.println("Fehler: " + e.getMessage());
			}
		
		return data;
		
	}
}
