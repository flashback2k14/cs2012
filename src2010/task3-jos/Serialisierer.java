package jos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialisierer {

	public static void main(String[] args) throws Exception {
		//
		Kunde k1 = new Kunde("Kunde #1", "Kunden Straﬂe 1, 12345 Kundhausen");
		Kunde k2 = new Kunde("Kunde #2", "Kundenweg 250, 78920 Kundenstadt");
		//
		ArrayList<Kunde> kundenListe = new ArrayList<Kunde>();
		kundenListe.add(k1);
		kundenListe.add(k2);
		kundenListe.add(k2);
		//
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kunden.dat"));
		oos.writeObject(kundenListe);
		oos.close();
		//
		ArrayList<Kunde>kundenListeDeserial = new ArrayList<Kunde>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kunden.dat"));
		kundenListeDeserial = (ArrayList<Kunde>) ois.readObject();
		ois.close();
		//
		for (Kunde k : kundenListeDeserial) {
			System.out.println("Kundenname: " + k.getName() + "\nKundenadresse: " + k.getAdresse());
		}
		//
		System.out.println((kundenListeDeserial.get(1) == kundenListeDeserial.get(2) ? "Die Objekte sind gleich.": "Die Objekte sind nicht gleich."));
		System.out.println((kundenListeDeserial.get(1).equals(kundenListeDeserial.get(2)) ? "Die Objekte sind gleich.": "Die Objekte sind nicht gleich."));
	}
	
	/**
	 * Output:
	 * 
	 * Kundenname: Kunde #1
	 * Kundenadresse: Kunden Straﬂe 1, 12345 Kundhausen
	 * Kundenname: Kunde #2
	 * Kundenadresse: Kundenweg 250, 78920 Kundenstadt
	 * Kundenname: Kunde #2
	 * Kundenadresse: Kundenweg 250, 78920 Kundenstadt
	 * Die Objekte sind gleich.
	 * Die Objekte sind gleich.
	 * 
	 */
}