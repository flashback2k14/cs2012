package task5;

public class Konkurrent extends Thread {

	private Monat monat;
	private int nummer;
	private String name;
	
	public Konkurrent(Monat m, int nr, String name) {
		this.monat = m;
		this.nummer = nr;
		this.name = name;
	}

	@Override
	public void run() {
		super.run();
		//
		while (!currentThread().isInterrupted()) {
			this.monat.setMonat(this.nummer, this.name);
		}
	}
}