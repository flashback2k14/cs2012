package task4;

import java.util.ArrayList;

public class LTFour {

	public static void main(String[] args) {
	
		// Erstelle Seite und weitere Objekte.
        Seite seite1 = new Seite();
        seite1.schrift = new Schrift();
        seite1.hintergrund = null;
        seite1.elemente = new ArrayList<SeitenInhalt>();
        seite1.schrift.farbe = new Farbe();
        SeitenInhalt art = new Artikel();
        SeitenInhalt anz = new Anzeige();

        // Initialisiere Objekteigenschaften.
        seite1.schrift.farbe.name = "schwarz1";
        art.text = "Artikeltext";
        anz.text = "Anzeigentext";
        seite1.elemente.add(art);
        seite1.elemente.add(anz);

        // Klone Seite.
        Seite seite2 = (Seite) seite1.clone();

        // Ändere einige Objekteigenschaften.
        seite2.schrift.farbe.name = "blau1";
        seite2.elemente.get(0).text = "";

        // Gib Werte aus.
        System.out.println("Seite1 Text: " + seite1.elemente.get(0).text);
        System.out.println("Seite1 Schriftfarbe: " + seite1.schrift.farbe.name);
        System.out.println("Seite2 Text: " + seite2.elemente.get(0).text);
        System.out.println("Seite2 Schriftfarbe: " + seite2.schrift.farbe.name);
	}
	
	/**
	 * Output
	 * 
	 * Fehler! Hintergrund ist null.
	 * Seite1 Text: Artikeltext
	 * Seite1 Schriftfarbe: blau1
 	 * Seite2 Text: 
	 * Seite2 Schriftfarbe: blau1
	 * 
	 */
}