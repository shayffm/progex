package fh.prog.lab.it.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class mainframe {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private String title = "Sharknado Beta 0.1";
	public mainframe(){
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		JFrame frame = new JFrame(title);
		frame.setSize((int)width, (int)height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
