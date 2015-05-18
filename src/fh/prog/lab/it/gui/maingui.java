package fh.prog.lab.it.gui;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.medialib.mlib.Image;

	public class maingui {
	private String title = "Sharknado Synergy Base v0.1";
	private Image vertrieb,inventur,werbung,statistik,managment;
	
		public maingui(){
			JFrame frame = new JFrame(title);
			JPanel panel = new JPanel();
			LayoutManager layout = new GridLayout(2,2);
			
			
			frame.setSize(800, 600);
			panel.setLayout(layout);
			
		}
	
}
