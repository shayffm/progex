package fh.prog.lab.it.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class mainframe{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private String title = "Sharknado SynergyBase Beta 0.1";
	JFrame frame = new JFrame(title);
	JPanel home = new homepanel();
	JMenuBar bar = new menubar();
	public mainframe(){
		frame.setLayout(new BorderLayout());
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		frame.add(bar,BorderLayout.NORTH);
		frame.add(home,BorderLayout.CENTER);
		frame.setSize((int)width/2, (int)height);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void dispose() {
		dispose();

	}


}
