package fh.prog.lab.it.gui;


import java.net.URL;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class homepanel extends JPanel{
	gui_controller control = new gui_controller();
	URL kunden;
	URL vertrieb;
	ImageIcon produkticon = new ImageIcon("./lib/earth213.png");
	ImageIcon vertriebicon = new ImageIcon("./lib/handshake1.png");
	ImageIcon bestellungicon = new ImageIcon("./lib/verification5.png");
	ImageIcon manageicon = new ImageIcon("./lib/three115.png");
	
	JButton jprodukt = new JButton(produkticon);
	JButton jvertrieb = new JButton(vertriebicon);
	JButton jbestellung = new JButton(bestellungicon);
	JButton jmanage = new JButton(manageicon);
	public homepanel(ActionListener listener){
		System.out.println("HomePanel wurde gestartet");
		produkticon.setDescription("Produkte");
		setLayout(new GridLayout(2,4));
		add(jprodukt);
		add(jvertrieb);
		add(jbestellung);
		add(jmanage);
		
		jprodukt.setActionCommand("produkt");
		jprodukt.addActionListener(listener);
		
		jvertrieb.setActionCommand("vertrieb");
		jvertrieb.addActionListener(listener);
				
		jbestellung.setActionCommand("bestellung");
		jbestellung.addActionListener(listener);
		
		jmanage.setActionCommand("manage");
		jmanage.addActionListener(listener);
		
		setVisible(true);
	}


}
