package task2;

import java.util.Stack;

public class Launcher {

	/** Hilfsklasse, welche einen Brief repräsentiert. */
	static class Brief {
		private static int count = 0;
		private int id;
		private String von;
		private String an;
		
		public Brief(String von, String an) {
			(this.count)++;
			this.id = count;
			this.von = von;
			this.an = an;
		}
		
		public String getBriefkopf() {
			return "Brief von " + this.von + " an " + this.an + " mit dem Index: " + this.id;
		}
	}
	
	public static void main(String[] args) {
		// Erzeuge Stapel.
        Stack<Brief> s = new Stack<Brief>();
        // Erstelle Briefe.
        Brief b1 = new Brief("Max Muster", "Marta Mayer");
        Brief b2 = new Brief("Helga Mustermann", "Max Muster");
        Brief b3 = new Brief("Toni Testmann", "Marios Testmann");
        Brief b4 = new Brief("Rosa Ulrich", "Marta Mayer");
        // Lege Briefobjekte auf Stack.
        s.push(b1);
        s.push(b2);
        s.push(b3);
        s.push(b4);
        // Entnehme letzten Brief, ohne ihn aus dem Stapel zu entfernen.
        Brief b = s.peek();
        // Gib Briefkopf aus.
        System.out.println(b.getBriefkopf());
        // Merke Position von Brief "b2" (Briefposition von oben).
        int p = s.search(b2);
        // Gib Briefposition aus.
        System.out.println("Brief 2 liegt als " + p + "-ter von oben auf dem Stapel!");
        // Entferne alle Briefe, die oberhalb von Brief 2 liegen.
        for (int i = 0; i < p - 1; i++) {
            // Entnehme jeweils obersten Brief.
            s.pop();
        }
        // Gib Brief 2 aus und entferne ihn aus dem Stapel.
        b = s.pop();
        // Gib Briefkopf aus.
        System.out.println(b.getBriefkopf());
        // Entferne alle weiteren Briefe aus Stapel.
        while (!s.empty()) {
            // Entnehme jeweils obersten Brief.
            s.pop();
        }
        //
        System.out.println("Auf dem Stapel sind noch " + s.size() + " Briefe vorhanden.");
        System.out.println("Ok, alle Briefe sind \"gelesen\", ich kann nach Hause gehen.");
	}
	
	/**
	 * Output
	 *
	 *	Brief von Rosa Ulrich an Marta Mayer mit dem Index: 4
	 *	Brief 2 liegt als 3-ter von oben auf dem Stapel!
	 *	Brief von Helga Mustermann an Max Muster mit dem Index: 2
	 *	Auf dem Stapel sind noch 0 Briefe vorhanden.
	 *	Ok, alle Briefe sind "gelesen", ich kann nach Hause gehen.
	 */
}