package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Launcher {

	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void initLogger () {
		try {
			logger.addHandler(new FileHandler("E:\\workspaceBA\\IT2010\\src\\logging\\log.xml"));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.setLevel(Level.INFO);
	}
	
	public static void main(String[] args) {
		//
		initLogger();
		//
		logger.log(Level.INFO, "Programm gestartet");
		//
		int z1 = 20;
		int z2 = 0;
		Calculator c = new Calculator();
		//
		System.out.println("Ergebnis: " + c.divide(z1, z2));
		//
		logger.log(Level.INFO, "Programm finish");
	}
	
	/**
	 * Output:
	 * 
	 * Sep 16, 2014 10:26:51 PM logging.Launcher main
	 * Information: Programm gestartet
	 * / by zero
	 * Sep 16, 2014 10:26:51 PM logging.Calculator divide
	 * Warnung: Teilen durch null
	 * Sep 16, 2014 10:26:51 PM logging.Launcher main
	 * Information: Programm finish
	 * 
	 */
}