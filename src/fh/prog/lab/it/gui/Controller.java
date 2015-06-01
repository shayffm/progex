package fh.prog.lab.it.gui;
import java.awt.BorderLayout;
import java.awt.event.*;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class Controller implements ActionListener{
	mainframe main = new mainframe();
	menubar bar = new menubar(); 
	homepanel hpanel = new homepanel();
	public void Controller(){
		main.frame.add(bar,BorderLayout.NORTH );
		main.frame.add(hpanel,BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int trigger = 0;
		
		switch (trigger) {
		case 1: System.out.println("Hallo");
		case 2: System.exit(0);
		
		default:
			break;
		}
		
	}

}
