package fh.prog.lab.it.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import fh.prog.lab.it.samples.dbServices.Select;
import fh.prog.lab.it.samples.dbServices.newselect;

public class table {
	DefaultTableModel model;
	Select select;
	ResultSet res;
	newselect sel;
	Vector<String> columnname;
	Vector<String> rowdata;
	public DefaultTableModel gettable (String table){
		try {
			res=select.doSelect(table);
			sel = new newselect();
			columnname = sel.getColumnNames(table);
			rowdata = sel.getData(table);
			model = new DefaultTableModel(rowdata, columnname);
		} catch (SQLException e) {
			System.out.println("Die Datenbank konnte nicht geladen werden");
			e.printStackTrace();
		}
		
		
	return model;	
	}

}
