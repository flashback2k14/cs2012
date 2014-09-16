package task4;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class TaskFour {

	public static void main(String[] args) {

		String pathXmlFile = "F:\\Dokumente\\BA\\Sem2\\DV\\2011\\personen.xml";
		
		try {
		   XMLReader myReader = XMLReaderFactory.createXMLReader();
		   //
		   PersonenHandler personenHandler = new PersonenHandler();
		   //
		   myReader.setContentHandler(personenHandler);
		   //
		   myReader.parse(pathXmlFile);
		} catch (SAXException e) {
		   System.err.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * XML - Datei beginnt
	 * Person [id=1, name=Mustermann, vorname=Max, abteilung=Vertrieb, postleitzahl=54321, ort=Musterdorf]
	 * Person [id=2, name=Müller, vorname=Petra, abteilung=Verwaltung, postleitzahl=76543, ort=Beispieldorf]
	 * XML - Datei endet
	 */
}