package task5;

public class Leser extends Thread {
	
	private Monat monat;
	
	public Leser(Monat m) {
		this.monat = m;
	}

	@Override
	public void run() {
		super.run();
		//
		while (!currentThread().isInterrupted()) {
			System.out.println(this.monat.toString());
		}
	}	
}