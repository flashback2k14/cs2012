package logging;

import java.util.logging.Level;

public class Calculator {

	public int divide (int a, int b) {
		int ergebnis = 0;
		
		try {
			ergebnis = a / b;
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			Launcher.logger.log(Level.WARNING, "Teilen durch null");
		}
			
		return ergebnis;
	}
}