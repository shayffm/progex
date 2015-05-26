package fh.prog.lab.it.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class mainframe {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private String title = "Sharknado SynergyBase Beta 0.1";
	public mainframe(){
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		JFrame frame = new JFrame(title);
		frame.setLayout(new BorderLayout());
		JMenuBar menubar = new menubar();
		frame.add(menubar,BorderLayout.NORTH);
	
		JPanel home = new homepanel();
		frame.add(home,BorderLayout.CENTER);
		
		frame.setSize((int)width/2, (int)height);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	}

}
