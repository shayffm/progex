package fh.prog.lab.it.gui;

public class gui_controller {
	private int con = 0;
	
	public gui_controller(){
		switch (con) {
		case 1: //main.home.setVisible(false);
			
			break;

		default:
			break;
		}
	}
	
	/*
	 * getter and setter for controller 
	 */
	public int getCon() {
		return con;
	}
	public void setCon(int con) {
		if (con < 0) {
			
		} else 
		this.con = con;
	}
	
	
}
