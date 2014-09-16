package task6;

import java.util.ArrayList;
import java.util.List;

public class TaskSix {

	public static void main(String[] args) {
		//String zum zerlegen
		String mailAdresse = "bill@gates.com\nkonrad@zuse.de"
				+ "\talbert@einstein.de\ntestAfehler.de\t@Testtext.com"
				+ "\nohne@punktnet\tmitZahl@12.de mit12@zahl.net nicht"
				+ "@unterstuetz.net";
		//Regulärer Ausdruck zur Prüfung
		String regEx = "([\\p{Alpha}]+)@([\\p{Alpha}]+)\\.de";
		//Listen zum Speichern der Mail-Adressen
		List<String> mailAddressListGerman = new ArrayList<String>();
		List<String> mailAddressListOther = new ArrayList<String>();
		//Zählvariablen
		int counter = 0;
		int counterOther = 0;
		//String verlegen in Einzelteile
		String[] splittedAdress = mailAdresse.split("\\s");
		//verlegten String durchsuchen nach gültigen Mail Adressen 
		for (String item : splittedAdress) {
			if (item.matches(regEx)) {
				counter++;
				mailAddressListGerman.add(item);
			} else {
				counterOther++;
				mailAddressListOther.add(item);
			}
		}
		//Ausgabe gültige Adressen
		System.out.println("Counter: " + counter);
		System.out.println("Mail Adressen Liste Deutsch:");
		for (String item : mailAddressListGerman) {
			System.out.println("Item: " + item.toString());
		}	
		System.out.println("-----------------------------------");
		//Ausgabe ungültige Adressen
		System.out.println("Counter: " + counterOther);
		System.out.println("Mail Adressen Liste Andere:");
		for (String item : mailAddressListOther) {
			System.out.println("Item: " + item.toString());
		}	
	}
	/**
	 * Output:
	 * 
	 *  Counter: 2
		Mail Adressen Liste Deutsch:
		Item: konrad@zuse.de
		Item: albert@einstein.de
		-----------------------------------
		Counter: 7
		Mail Adressen Liste Andere:
		Item: bill@gates.com
		Item: testAfehler.de
		Item: @Testtext.com
		Item: ohne@punktnet
		Item: mitZahl@12.de
		Item: mit12@zahl.net
		Item: nicht@unterstuetz.net
	 */
}