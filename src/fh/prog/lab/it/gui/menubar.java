package fh.prog.lab.it.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
	JMenuItem about = new JMenuItem("Ueber Sharknado SynergyBase");
	
	public menubar(ActionListener listener){
		add(file);
		file.add(neu);
		file.add(exit);
		add(settings);
		settings.add(edit);
		settings.add(window);
		add(help);
		help.add(about);
		
		
		exit.setActionCommand("exit");
		exit.addActionListener(listener);
		
	
	}
	
}
