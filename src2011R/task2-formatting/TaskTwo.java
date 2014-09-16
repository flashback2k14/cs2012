package task2;

public class TaskTwo {

	public static void printName(String vorname, String nachname, String stadt, double alter) {
		System.out.printf("%-5s %-5s %n", vorname, nachname);
		System.out.printf("%5S %n", stadt.substring(0, 3));
		System.out.printf("%06.2f", alter);
	}
		
	public static void main(String[] args) {
		//
		String vorname = args[0];
		String nachname = args[1];
		//
		System.out.printf("%s %S", vorname, nachname);
		System.out.printf("%n%n%n");
		//
		for (int i = 0; i < 16; i++) {
			System.out.printf("Dez: %d | Hex: %X %n", i, i);
		}
		//
		System.out.printf("%n");
		printName(vorname, nachname, "Entenhausen", 35.875);
	}
	
	/**
	 * Output:
	 * 
	 * Sebastian KLOPPE
	 * 
	 * 
	 * Dez: 0 | Hex: 0 
	 * Dez: 1 | Hex: 1 
	 * Dez: 2 | Hex: 2 
 	 * Dez: 3 | Hex: 3 
	 * Dez: 4 | Hex: 4 
	 * Dez: 5 | Hex: 5 
	 * Dez: 6 | Hex: 6 
	 * Dez: 7 | Hex: 7 
	 * Dez: 8 | Hex: 8 
	 * Dez: 9 | Hex: 9 
	 * Dez: 10 | Hex: A 
	 * Dez: 11 | Hex: B 
	 * Dez: 12 | Hex: C 
	 * Dez: 13 | Hex: D 
	 * Dez: 14 | Hex: E 
	 * Dez: 15 | Hex: F 
	 *
	 * Sebastian Kloppe 
   	 *   ENT 
	 * 035,88
	 *
	 */
}