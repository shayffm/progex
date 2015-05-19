package fh.prog.lab.it.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class mainframe {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public mainframe(){
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		JFrame frame = new JFrame();
		frame.setSize((int)width, (int)height);
	}

}
