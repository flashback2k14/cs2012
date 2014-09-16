package task1;

import java.math.BigInteger;

public class LauncherTask1 {

	public static void print (Paar<?, ?> p) {
		System.out.println("Paar: (" + p.getTvar() + " , " + p.getUvar() + ")");
	}
	
	public static void main(String[] args) {
		//Deklaration
		ZahlenPaar<Integer, Double> z1;
		ZahlenPaar<BigInteger, Double> z2;
		//Initialisieren
		z1 = new ZahlenPaar<Integer, Double>(12, 1.23);
		z2 = new ZahlenPaar<BigInteger, Double>(new BigInteger("99999"), 1.23);
		//Aufruf Print Methode aus Launcher Klasse
		print(z1);
		print(z2);
		//Aufruf der Methode zum Summieren der beiden Variablen + Ausgabe
		System.out.println("Ergebnis Z1: " + z1.sumTwoValues());
		System.out.println("Ergebnis Z2: " + z2.sumTwoValues());
	}
	
	/**
	 * Output
	 * 
	 *  Paar: (12 , 1.23)
		Paar: (99999 , 1.23)
		Ergebnis Z1: 13.23
		Ergebnis Z2: 100000.23
	 */
}