package fh.prog.lab.it.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import fh.prog.lab.it.controller.Controller;

public class menubar extends JMenuBar {

	JMenu file = new JMenu("Datei");
	JMenuItem neu = new JMenuItem("Neu");
	JMenuItem exit = new JMenuItem("Schliessen");
	
	
	JMenu settings = new JMenu("Einstellungen");
	JMenuItem edit = new JMenuItem("Bearbeiten");
	JMenuItem window = new JMenuItem("Fenster");
	
	
	JMenu help = new JMenu("Hilfe");
	JMenuItem help_content = new JMenuItem("Anleitung");
	JMenuItem contact = new JMenuItem("Kontaktieren");
	JMenuItem about = new JMenuItem("Über Sharknado SynergyBase");
	
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
