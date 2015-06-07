package fh.prog.lab.it.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class produktpanel extends JPanel{
	JTable table;
	private String[] colnames = {
			"ProduktID",
			 "Name",
			 "Versionspreis",
			 "Listenpreis",
	};
	private Object[][] test = {
			{"Hallo","Test"},
			{"Hallo","Test"},
			{"Hallo","Test"},
			{"Hallo","Test"}
	};
	public produktpanel(){
		System.out.println("Produktpanel wurde gestartet");
		table = new JTable(test, colnames);
		add(new JScrollPane(table));
		setVisible(false);
	}
}
