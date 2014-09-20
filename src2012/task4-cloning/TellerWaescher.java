package task4;

public class TellerWaescher extends Rolle implements Cloneable {

	public TellerWaescher(String name) {
		super(name);
	}	
	
	@Override
	public TellerWaescher clone() {
		TellerWaescher tw = null;
		
		tw = (TellerWaescher) super.clone();
		
		return tw;
	}
}