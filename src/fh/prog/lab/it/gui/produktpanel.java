package fh.prog.lab.it.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class produktpanel extends JPanel{
	JLabel test = new JLabel("Test");
	public produktpanel(){
		System.out.println("Produktpanel wurde gestartet");
		setLayout(new GridLayout(4,2));
		add(test);
		setVisible(true);
	}
}
