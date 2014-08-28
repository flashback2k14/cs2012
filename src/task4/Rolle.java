package task4;

public class Rolle implements Cloneable {

	private String name;

	public Rolle(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	protected Rolle clone() {
		Rolle r = null;
		
		try {
			r = (Rolle) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return r;
	}
}