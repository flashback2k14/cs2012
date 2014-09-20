package task4;

public class Bar implements Cloneable {

	private int groesze;
	
	public Bar(int groesze) {
		this.groesze = groesze;
	}

	public int getGroesze() {
		return this.groesze;
	}
	
	@Override
	public Bar clone() {
		Bar b = null;
		
		try {
			b = (Bar) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return b;
	}
}