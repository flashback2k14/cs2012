package task4;


public class SeitenInhalt implements Cloneable {

	public String text;

	@Override
	public SeitenInhalt clone() {
		SeitenInhalt si = null;
		
		try {
			si = (SeitenInhalt) super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex.getMessage());
		}
		
		return si;
	}	
}