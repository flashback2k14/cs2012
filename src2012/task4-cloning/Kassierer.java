package task4;

public class Kassierer extends Rolle implements Cloneable {

	public Kassierer(String name) {
		super(name);
	}	
	
	@Override
	public Kassierer clone() {
		Kassierer k = null;
		
		k = (Kassierer) super.clone();
		
		return k;
	}
}