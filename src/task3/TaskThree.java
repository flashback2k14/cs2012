package task3;

public class TaskThree {

	/**
	 * Cheat Sheet 
	 * http://alvinalexander.com/programming/printf-format-cheat-sheet
	 */
	public static void main(String[] args) {
		//Vor- / Nachname von Kommandozeile
		String vorname = args[0];
		String nachname = args[1];
		//Ausgabe Namen in Groﬂbuchstaben
		System.out.printf("%S %n%n%n", nachname);
		//
		for (int i = 0; i < 16; i++) {
			//Ausgabe Nummer in Dez und Hex
			System.out.printf("Dez: %d | Hex: %x \n", i, i);
		}
		//Ausgabe Leerzeile
		System.out.printf("%n");
		printName(vorname, nachname, "lpz", 1d);
	}
	
	public static void printName (String vorname, String nachname, String stadt, double alter) {
		//Ausgabe Vorname + Nachname min. 5 Zeichen, linksb¸ndig
		System.out.printf("%-5s %n", vorname);
		System.out.printf("%-5s %n", nachname);
		//Ausgabe Stadt min. 5 Zeichen, ersten 3 Groﬂbuchstaben
		System.out.printf("%5.3S %n", stadt);
		//Ausgabe Alter 000.00 (06 = Gesamtzeichen, 2 = Kommastellen
		System.out.printf("%06.2f", alter);
	}
	
	/**
	 * Output
	 * 
	 *  KLOPPE 
	
	
		Dez: 0 | Hex: 0 
		Dez: 1 | Hex: 1 
		Dez: 2 | Hex: 2 
		Dez: 3 | Hex: 3 
		Dez: 4 | Hex: 4 
		Dez: 5 | Hex: 5 
		Dez: 6 | Hex: 6 
		Dez: 7 | Hex: 7 
		Dez: 8 | Hex: 8 
		Dez: 9 | Hex: 9 
		Dez: 10 | Hex: a 
		Dez: 11 | Hex: b 
		Dez: 12 | Hex: c 
		Dez: 13 | Hex: d 
		Dez: 14 | Hex: e 
		Dez: 15 | Hex: f 
	
		Sebastian 
		Kloppe 
		  LPZ 
		001,00
	*
	*/
}