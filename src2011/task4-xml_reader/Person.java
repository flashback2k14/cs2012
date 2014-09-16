package task4;

public class Person {

	/**
	 * Attribute
	 */
	private int id;
	private String name;
	private String vorname;
	private String abteilung;
	private String postleitzahl;
	private String ort;
	
	/**
	 * 
	 * Getter / Setter
	 */
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getAbteilung() {
		return abteilung;
	}
	
	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}
	
	public String getPostleitzahl() {
		return postleitzahl;
	}
	
	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	/**
	 * toString() - Methode
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", vorname=" + vorname
				+ ", abteilung=" + abteilung + ", postleitzahl=" + postleitzahl
				+ ", ort=" + ort + "]";
	}
}