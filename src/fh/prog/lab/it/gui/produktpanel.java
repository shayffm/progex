package fh.prog.lab.it.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fh.prog.lab.it.samples.dbServices.DBServicesInvoker;
import fh.prog.lab.it.samples.dbServices.newselect;

public class produktpanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTable table;
	ImageIcon iconback = new ImageIcon("./lib/back-button.png");
	JButton back = new JButton(iconback);
	newselect select = new newselect();
	public produktpanel(ActionListener listener) throws SQLException{
		System.out.println("Produktpanel wurde gestartet");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		this.setSize((int)(width/2), (int)(height/100)*70);
		setLayout(new GridLayout(4,2));
		table = new JTable(select.getData("Produkt"), select.getColumnNames("Produkt"));
		add(new JScrollPane((table)));
		back.setActionCommand("proback");
		back.addActionListener(listener);
		add(back);
	}
	
}
