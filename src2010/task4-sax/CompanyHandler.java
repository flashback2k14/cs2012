package sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CompanyHandler extends DefaultHandler {

	boolean firstName = false;
	boolean lastName = false;
	boolean nickName = false;
	boolean salary = false;

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("startDocument()");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		//
        System.out.println("Start Element: " + qName);
		//
		switch (qName) {
		case "firstname":
			firstName = true;
			break;
		case "lastname":
			lastName = true;
			break;
		case "nickname":
			nickName = true;
			break;
		case "salary":
			salary = true;
			break;
		default:
			break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		//
		if (this.firstName) {
            System.out.println("First Name: " + new String(ch, start, length));        
            this.firstName = false;
        }
        
        if (this.lastName) {
            System.out.println("Last Name: " + new String(ch, start, length));
            this.lastName = false;
        }
        
        if (this.nickName) {
            System.out.println("Nick Name: " + new String(ch, start, length));
            this.nickName = false;
        }
        
        if (this.salary) {
            System.out.println("Salary: " + new String(ch, start, length));
            this.salary = false;
        }
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
		//
		System.out.println("End Element: " + qName + "\n");
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("endDocument()");
	}

}