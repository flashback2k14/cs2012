package jos;

import java.io.Serializable;

public class Kunde implements Serializable {

	private static final long serialVersionUID = -4926152727827752631L;
	private String name;
	private String adresse;
	
	public Kunde() {
	}
	
	public Kunde(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	
	public Kunde(Kunde other) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}