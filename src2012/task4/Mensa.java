package task4;

import java.util.ArrayList;
import java.util.List;

public class Mensa implements Cloneable {

	public List<Rolle> angestellte;
	public Bar getraenkeBar;
	public Raum speiseSaal;
	public Kueche kueche;
	
	public Mensa(List<Rolle> angestellte, Bar getraenkeBar, Raum speiseSaal,
			Kueche kueche) {
		this.angestellte = angestellte;
		if (getraenkeBar != null) {
			this.getraenkeBar = getraenkeBar;
		}
		this.speiseSaal = speiseSaal;
		this.kueche = kueche;
	}
	
	@Override
	protected Mensa clone() {
		Mensa m = null;
		
		try {
			m = (Mensa) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		List <Rolle> anList = new ArrayList<Rolle>(m.angestellte.size());
		for (int i = 0; i < m.angestellte.size(); i++) {
			anList.add((Rolle) m.angestellte.get(i).clone());
		}
		
		m.angestellte = anList;
		if (m.getraenkeBar != null) {
			m.getraenkeBar = m.getraenkeBar.clone();
		}
		m.speiseSaal = m.speiseSaal.clone();
		m.kueche = m.kueche.clone();
		
		return m;
	}

	@Override
	public String toString() {
		return "Mensa " + getClass() + "\n"
				+ "[angestellte=" + angestellte + "\n"
				+ ", getraenkeBar="+ getraenkeBar + "\n"
				+ ", speiseSaal=" + speiseSaal + "\n"
				+ ", kueche=" + kueche + "]";
	}
}