package task5;

public class LTFive {

	public static void main(String[] args) {

		Monat monat = new Monat();
		Leser leser = new Leser(monat);
		//
		Konkurrent konkurrent1 = new Konkurrent(monat, 2, "Februar");
		Konkurrent konkurrent2 = new Konkurrent(monat, 3, "März");
		//
		leser.start();
		konkurrent1.start();
		konkurrent2.start();
		//
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//
		leser.interrupt();
		konkurrent1.interrupt();
		konkurrent2.interrupt();
	}
	
	/**
	 * Output
	 * 
	 * Monat [nummer=3, name=März]
	 * Monat [nummer=3, name=März]
	 * Monat [nummer=2, name=Februar]
	 * Monat [nummer=2, name=Februar]
	 *
	 */
}