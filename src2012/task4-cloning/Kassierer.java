package task4;

public class Kassierer extends Rolle implements Cloneable {

	public Kassierer(String name) {
		super(name);
	}	
	
	@Override
	protected Kassierer clone() {
		Kassierer k = null;
		
		k = (Kassierer) super.clone();
		
		return k;
	}
}