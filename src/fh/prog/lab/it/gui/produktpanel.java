package fh.prog.lab.it.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class produktpanel extends JPanel{
	JLabel test = new JLabel("Test");
	public produktpanel(){
		System.out.println("Produktpanel wurde gestartet");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		this.setSize((int)(width/2), (int)(height/100)*70);
		setLayout(new GridLayout(4,2));
		add(test);
				
	}
	
}
