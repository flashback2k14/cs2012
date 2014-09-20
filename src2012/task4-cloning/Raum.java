package task4;

public class Raum implements Cloneable {

	@Override
	public Raum clone() {
		Raum r = null;
		
		try {
			r = (Raum) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return r;
	}
}