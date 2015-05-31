package fh.prog.lab.it.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import fh.prog.lab.it.controller.Controller;

public class menubar extends JMenuBar {

	JMenu file = new JMenu("Datei");
	JMenu edit = new JMenu("Bearbeiten");
	JMenu window = new JMenu("Fenster");
	JMenu help = new JMenu("Hilfe");
	JMenu settings = new JMenu("Einstellungen");
	
	JMenuItem neu = new JMenuItem("Neu");
	JMenuItem exit = new JMenuItem("Schliessen");
	
	
	JMenuItem about = new JMenuItem("Über uns");
	public menubar(){
		add(file);
		file.add(neu);
		file.add(exit);
		add(settings);
		settings.add(edit);
		settings.add(window);
		add(help);
		help.add(about);
		
	
	}
	
}
