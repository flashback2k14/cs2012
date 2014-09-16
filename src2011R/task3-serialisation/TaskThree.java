package task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TaskThree {

	public static void main(String[] args) {
		//
		String path = "E:\\workspaceBA\\IT2011RKlausurAH\\src\\task3\\task3.xml";
		//
		Person p1 = new Person("Max", "Mann", 80f);
		Person p2 = new Person("Petra", "Frau", 60f);
		Person p3 = null;
		Person p4 = null;
		//
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		//
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
			outputStream.writeObject(p1);
			outputStream.writeObject(p2);
			//
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
			//
			p3 = (Person) objectInputStream.readObject();
			p4 = (Person) objectInputStream.readObject();
			//
			System.out.println(p3.toString());
			System.out.println(p4.toString());
			//
			objectInputStream.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (p1.equals(p3)) {
			System.out.println("p1 equals p3");
		} else {
			System.out.println("p1 not equals p3");
		}
		
		if (p2.equals(p4)) {
			System.out.println("p2 equals p4");
		} else {
			System.out.println("p2 not equals p4");
		}
	}
	
	/**
	 * Output
	 * 
	 * Person [name=Max, sex=Mann, weight=80.0, createTime=Sun Sep 14 21:46:10 CEST 2014]
	 * Person [name=Petra, sex=Frau, weight=60.0, createTime=Sun Sep 14 21:46:10 CEST 2014]
	 * Person [name=Max, sex=Mann, weight=0.0, createTime=Sun Sep 14 21:46:10 CEST 2014]
 	 * Person [name=Petra, sex=Frau, weight=0.0, createTime=Sun Sep 14 21:46:10 CEST 2014]
	 * p1 equals p3
	 * p2 equals p4
	 * 
	 */
}