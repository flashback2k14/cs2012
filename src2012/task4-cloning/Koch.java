package task4;

public class Koch extends Rolle implements Cloneable {

	public Koch(String name) {
		super(name);
	}	
	
	@Override
	public Koch clone() {
		Koch k = null;
		
		k = (Koch) super.clone();
		
		return k;
	}
}