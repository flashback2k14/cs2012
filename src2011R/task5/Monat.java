package task5;

public class Monat {

	private int nummer;
	private String name;
	
	public Monat() {
		this.nummer = 1;
		this.name = "Januar";
	}
	
	public synchronized void setMonat(int nummer, String name) {
		this.nummer = nummer;
		this.name = name;
	}

	@Override
	public synchronized String toString() {
		return "Monat [nummer=" + this.nummer + ", name=" + this.name + "]";
	}
}