package fh.prog.lab.it.controller;
import java.awt.event.*;

import fh.prog.lab.it.gui.mainframe;
import fh.prog.lab.it.gui.menubar;



public class Controller implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int trigger = 0;
		
		switch (trigger) {
		case 1: System.out.println("Hallo");
		case 2: //do something
		default:
			break;
		}
		
	}

}
