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
		String test = e.getSource().toString(); 
		System.out.println(test);
		if(e.getSource() == menu.exit){
			System.out.println("Funktioniert");
		}
		System.out.println(e.getSource().toString() + "+" + menu.exit.getName());
		String trigger = "";
		System.out.println(test);
		switch (trigger) {
		case "Start": System.out.println("Hallo");
		case "Exit": System.exit(0);
		
		default:
			break;
		}
		
	}

}
