package task4;

import java.util.ArrayList;

public class Seite implements Cloneable {

	public Schrift schrift;
	public Farbe hintergrund;
	public ArrayList<SeitenInhalt> elemente;

	@Override
    public Object clone() {
    
		Seite s = null;
		
        try {
        	s = (Seite) super.clone();
            
            // Die Schrift soll laut Aufgabenstellung nicht geklont werden.
            if (this.hintergrund != null) {
                s.hintergrund = (Farbe) this.hintergrund.clone();
            } else {
                System.err.println("Fehler! Hintergrund ist null.");
            }
            //
            // Ein Klonen des originalen Container-Objektes:
            // s.elemente = (ArrayList<SeitenInhalt>) this.elemente.clone();
            // ist ung�nstig, da sonst die Referenzen seiner enthaltenen
            // Elemente mit kopiert w�rden.
            // Zus�tzlich w�rden dann die neuen Objekte eingef�gt,
            // so dass doppelt so viele Elemente wie im Originalcontainer
            // enthalten w�ren.
            // Also gibt es zwei M�glichkeiten:
            // 1 Container clonen, Elemente leeren und mit neuen f�llen
            // 2 Neuen Conteiner erzeugen und mit neuen Elementen f�llen
            //
            s.elemente = new ArrayList<SeitenInhalt>();
            SeitenInhalt i = null;
            
            for (SeitenInhalt e : this.elemente) {
                i = (SeitenInhalt) e.clone();
                s.elemente.add(i);
            }
        } catch (CloneNotSupportedException ex) {
        	System.out.println(ex.getMessage());
        }
		
        return s;
    }
}