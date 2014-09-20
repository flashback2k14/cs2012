package task4;

public class Kueche implements Cloneable {

	@Override
	public Kueche clone() {
		Kueche k = null;
		
		try {
			k = (Kueche) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return k;
	}
}