package fh.prog.lab.it.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import fh.prog.lab.it.samples.dbServices.DBServicesInvoker;
import fh.prog.lab.it.samples.dbServices.Select;
import fh.prog.lab.it.samples.dbServices.newselect;

public class produktpanel extends JPanel{
	DBServicesInvoker service;
	JTable table;
	JLabel test = new JLabel("Test");
	newselect select = new newselect();
	public produktpanel() throws SQLException{
		System.out.println("Produktpanel wurde gestartet");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		this.setSize((int)(width/2), (int)(height/100)*70);
		setLayout(new GridLayout(4,2));
		add(test);


		table = new JTable(select.getData("Produkt"), select.getColumnNames("Produkt"));
		add(new JScrollPane((table)));
	}
	
}
