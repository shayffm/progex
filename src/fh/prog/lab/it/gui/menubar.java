package fh.prog.lab.it.gui;

import javax.swing.*;

public class menubar extends JMenuBar{
	JMenu file = new JMenu("Datei");
	JMenu edit = new JMenu("Bearbeiten");
	JMenu window = new JMenu("Fenster");
	JMenu help = new JMenu("Hilfe");
	
	JMenuItem neu = new JMenuItem("Neu");
	JMenuItem exit = new JMenuItem("Schliessen");
	
	
	JMenuItem about = new JMenuItem("Über uns");
	public menubar(){
		add(file);
		file.add(neu);
		file.add(exit);
		add(edit);
		add(window);
		add(help);
		help.add(about);
	}
}
