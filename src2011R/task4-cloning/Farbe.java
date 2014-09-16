package task4;

public class Farbe implements Cloneable {

	public String name;
	
	@Override
	public Farbe clone() {
		Farbe f = null;
		
		try {
			f = (Farbe) super.clone();
		} catch (CloneNotSupportedException exception) {
			System.out.println(exception.getMessage());
		}
		
		return f;
	}
}