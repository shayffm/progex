package fh.prog.lab.it.gui;
import java.awt.BorderLayout;
import java.awt.event.*;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class Controller implements ActionListener{
	mainframe main = new mainframe(action);
	public void Controller(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String test = e.getSource().toString(); 
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
