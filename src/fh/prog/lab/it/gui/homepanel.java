package fh.prog.lab.it.gui;


import java.net.URL;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class homepanel extends JPanel{
	URL kunden;
	URL vertrieb;
	ImageIcon produkticon = new ImageIcon("./lib/earth213.png");
	ImageIcon vertriebicon = new ImageIcon("./lib/handshake1.png");
	ImageIcon bestellungicon = new ImageIcon("./lib/verification5.png");
	ImageIcon manageicon = new ImageIcon("./lib/three115.png");
	
	JLabel jprodukt = new JLabel(produkticon);
	JLabel jvertrieb = new JLabel(vertriebicon);
	JLabel jbestellung = new JLabel(bestellungicon);
	JLabel jmanage = new JLabel(manageicon);
	public homepanel(){
		System.out.println("HomePanel wurde gestartet");
		produkticon.setDescription("Produkte");
		setLayout(new GridLayout(2,4));
		add(jprodukt);
		add(jvertrieb);
		add(jbestellung);
		add(jmanage);
		setVisible(true);
	}
}
