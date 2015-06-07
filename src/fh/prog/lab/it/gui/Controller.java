package fh.prog.lab.it.gui;
import java.awt.BorderLayout;
import java.awt.event.*;

import com.sun.org.apache.bcel.internal.generic.NEW;

import fh.prog.lab.it.main.Main;


public class Controller implements ActionListener{
	 menubar menu;
	public Controller(){
		System.out.println("Controller Gestartet");
		new mainframe(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String trigger = e.getActionCommand();
		switch (trigger) {
		case "Start": System.out.println("Hallo");
		case "exit": System.exit(0);
		
		default:
			break;
		}
		
	}

}
