package task4;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PersonenHandler extends DefaultHandler {
	//
	Person person = null;
	String zeichenZwischenTags = null;
	ArrayList<Person> personList = new ArrayList<Person>();
	/**
	 * 
	 * Start
	 * 
	 */
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("XML - Datei beginnt");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		//
		if ("person".equals(localName)) {
			person = new Person();
			person.setId(Integer.parseInt(attributes.getValue("id")));
			
		}
	}
	/**
	 * 
	 * Characters
	 * 
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		//
		zeichenZwischenTags = new String(ch, start, length);
	}
	/**
	 * 
	 * Ende
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
		//
		if (person != null) {
			//
			switch (localName) {
			case "name":
				person.setName(zeichenZwischenTags);
				break;
			case "vorname":
				person.setVorname(zeichenZwischenTags);
				break;
			case "abteilung":
				person.setAbteilung(zeichenZwischenTags);
				break;
			case "postleitzahl":
				person.setPostleitzahl(zeichenZwischenTags);
				break;
			case "ort":
				person.setOrt(zeichenZwischenTags);
				break;
			case "person":
				personList.add(person);
				System.out.println(person.toString());
				break;
				
			default:
				break;
			}
		}
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("XML - Datei endet");
	}
}