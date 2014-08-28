package task5;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TaskFive {

	/**
	 * Lib (.jar) hinzufügen
	 * --> rechts klick auf Projekt
	 * --> Build Path
	 * --> Configure Build Path
	 * --> Add External JARS
	 */
	public static void main(String[] args) {
		//Reader erzeugen
		SAXReader reader = new SAXReader();
		//XML Path
		String pathXML = "E:\\workspaceBA\\KlausurCS12\\src\\addressbook.xml";
		//Zähler Variablen 
		int countOuter = 0, countInner = 0;
		//Temp String für Zahlerlaufe
		String tmp = null;
		
		try {
			//Erzeuge Document aus XML
			Document document = reader.read(pathXML);
			//Erhalte Root Element des Documents
			Element elementRoot = document.getRootElement();
			//Erzeuge Iteratoren
			Iterator<Element> iterator = elementRoot.elementIterator(); 
			Iterator<Element> iterator2 = null;
			//Erzeuge Elemente
			Element e = null;
			Element e2 = null;
			
			//Führe solange die Schleife aus bis keine Elemente mehr vorhanden sind
			while (iterator.hasNext()) {
				//ersten Zähler um 1 erhöhen
				countOuter++;
				//Element vom Iterator erhalten
				e = iterator.next();
				//zweiten Iterator zuweisen
				iterator2 = e.elementIterator();
				//Ausgabe Root Element Adresse + Position / ID
				System.out.println("##################################");
				System.out.println("Name: " + e.getName() + " || Attribut: " + e.attributeValue("id"));
				
				//Führe solange die Schleife aus bis keine Elemente mehr vorhanden sind
				while (iterator2.hasNext()) {
					//Element vom Iterator erhalten
					e2 = iterator2.next();
					//Temp String Element Inhalt zuweisen
					tmp = e2.getText();
					//Prüfung Inhalt Temp String auf Märchenland
					if (tmp.equals("Märchenland")) {
						//zweiten Zähler um 1 erhöhen
						countInner++;
					}
					//Ausgabe Inhalt aus Root Element
					System.out.println("Name: " + e2.getName() + " || Inhalt: " + e2.getText());
				}
			}
			//Ausgabe des Zähler-Ergebnis
			System.out.println("\nCountOuter: Anzahl Adressen: " + countOuter + "\nCountInner: Anzahl Adressen mit Märchenland: " + countInner);
		} catch (DocumentException de) {
			System.out.println(de.getMessage());
			de.printStackTrace();
		}
	}
	
	/**
	 * Output
	 * 
	 *  ##################################
		Name: address || Attribut: 0
		Name: firstname || Inhalt: Hans
		Name: lastname || Inhalt: Im Glück
		Name: street || Inhalt: Feldweg 1
		Name: country || Inhalt: Märchenland
		##################################
		Name: address || Attribut: 1
		Name: firstname || Inhalt: Max
		Name: lastname || Inhalt: Tunichtgut
		Name: street || Inhalt: Waldstraße 13
		Name: country || Inhalt: Traumland
		##################################
		Name: address || Attribut: 2
		Name: firstname || Inhalt: Ruth
		Name: lastname || Inhalt: Käppchen
		Name: street || Inhalt: Wolfspfad 3
		Name: country || Inhalt: Märchenland
		##################################
		Name: address || Attribut: 3
		Name: firstname || Inhalt: Rapunzel
		Name: lastname || Inhalt: Langhaar
		Name: street || Inhalt: Turm 0
		Name: country || Inhalt: Märchenland
		##################################
		Name: address || Attribut: 4
		Name: firstname || Inhalt: Rudi
		Name: lastname || Inhalt: Ratlos
		Name: street || Inhalt: Wolkenweg 100
		Name: country || Inhalt: Chaosland
		##################################
		Name: address || Attribut: 5
		Name: firstname || Inhalt: Marie
		Name: lastname || Inhalt: Gold
		Name: street || Inhalt: Wolkenweg 100
		Name: country || Inhalt: Märchenland
		
		CountOuter: Anzahl Adressen: 6
		CountInner: Anzahl Adressen mit Märchenland: 4
	 */
}