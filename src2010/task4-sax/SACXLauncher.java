package sax;


import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SACXLauncher {

	public static void main(String[] args) {

		String path = "F:/Dokumente/BA/Sem2/DV/2010/company.xml";
		//		
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			//
			CompanyHandler companyHandler = new CompanyHandler();
			//
			reader.setContentHandler(companyHandler);
			//
			reader.parse(path);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}