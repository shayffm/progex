package fh.prog.lab.it.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class mainframe{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private String title = "Sharknado SynergyBase Beta 0.1";
	JFrame frame = new JFrame(title);
	homepanel home; 
	produktpanel produkt;
	
	public mainframe(ActionListener listener) throws SQLException{
		menubar bar = new menubar(listener);
		home = new homepanel(listener);	
		produkt = new produktpanel();
		frame.setLayout(new BorderLayout());
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		frame.add(bar,BorderLayout.NORTH);
		frame.add(produkt,BorderLayout.CENTER);
		frame.add(home);
		home.setVisible(true);
		
		
		frame.setSize((int)(width/2), (int)(height/100)*70);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void dispose() {
		dispose();
	// TODO Auto-generated method stub
	}

		
		
	}
