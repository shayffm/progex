/**
 * 
 */
package fh.prog.lab.it.samples.run;

import java.sql.SQLException;

import fh.prog.lab.it.gui.mainframe;
import fh.prog.lab.it.samples.dbServices.DBServicesInvoker;

/**
 * @author metin z.
 *
 */
public class runHere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// new mainframe();
		DBServicesInvoker dbService = new DBServicesInvoker();
		try {
			
			dbService.getDB();
		}catch (SQLException sqlex) {
			
			System.out.println("SQL Error : " + sqlex.getMessage());
		}  catch (Exception e) {
			
			System.out.println("SQL Error : " + e.getMessage());
		}
	}

}
