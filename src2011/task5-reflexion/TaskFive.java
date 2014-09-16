package task5;

import java.awt.Point;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class TaskFive {

	public static void main(String[] args) {

		Object o1 = "Meta Programmierung";
		Object o2 = new Date();
		Object o3 = 5;
		Object o4 = true;
		Object o5 = new Point(1, 2);
		//
		System.out.println("Klassenname: " + o1.getClass().getSimpleName() + " | Inhalt: " + o1.toString());
		System.out.println("Klassenname: " + o2.getClass().getSimpleName() + " | Inhalt: " + o2.toString());
		System.out.println("Klassenname: " + o3.getClass().getSimpleName() + " | Inhalt: " + o3.toString());
		System.out.println("Klassenname: " + o4.getClass().getSimpleName() + " | Inhalt: " + o4.toString());
		System.out.println("Klassenname: " + o5.getClass().getSimpleName() + " | Inhalt: " + o5.toString());
	    System.out.println("---------------------------------------------------");
		//
		Class<?> objekt5Class = o5.getClass();
		//
		Field[] fields = objekt5Class.getDeclaredFields();
	    System.out.println("Anzahl deklarierte Eigenschaften: " + fields.length);     
	    for (Field field : fields) {
	        System.out.println(field.getGenericType() + " " + field.getName());  
	    }
	    //
	    System.out.println("---------------------------------------------------");
	    //
	    Constructor[] constructors = objekt5Class.getDeclaredConstructors();
	    System.out.println("Anzahl Konstruktoren: " + constructors.length);     
	    for (Constructor constructor : constructors) {
	    	System.out.println(constructor.getModifiers() + " " 
	    					+ constructor.getName() + " "
	    					+ constructor.getDeclaringClass());
	    }
	    //
	    System.out.println("---------------------------------------------------");
	    //
	    Method[] methods = objekt5Class.getDeclaredMethods();
	    System.out.println("Anzahl Methoden: " + methods.length);
	    for (Method method : methods) {
	    	System.out.println(method.getName());
	    }
	    //
	    System.out.println("---------------------------------------------------");
	    //
	    try {
		    System.out.println("Point Values vor der Änderung:");
	    	System.out.println(methods[3].getName() + ": " + methods[3].invoke(o5, null));
			System.out.println(methods[4].getName() + ": " + methods[4].invoke(o5, null));
			fields[0].set(o5, 30);
			fields[1].set(o5, 40);
			System.out.println("Point Values nach der Änderung:");
			System.out.println(methods[3].getName() + ": " + methods[3].invoke(o5, null));
			System.out.println(methods[4].getName() + ": " + methods[4].invoke(o5, null));
	    } catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Klassenname: String | Inhalt: Meta Programmierung
	 * Klassenname: Date | Inhalt: Fri Sep 12 21:25:21 CEST 2014
	 * Klassenname: Integer | Inhalt: 5
	 * Klassenname: Boolean | Inhalt: true
	 * Klassenname: Point | Inhalt: java.awt.Point[x=1,y=2]
	 * ---------------------------------------------------
	 * Anzahl deklarierte Eigenschaften: 3
	 * int x
	 * int y
 	 * long serialVersionUID
	 * ---------------------------------------------------
	 * Anzahl Konstruktoren: 3
	 * 1 java.awt.Point class java.awt.Point
	 * 1 java.awt.Point class java.awt.Point
	 * 1 java.awt.Point class java.awt.Point
	 * ---------------------------------------------------
	 * Anzahl Methoden: 10
	 * equals
	 * toString
	 * getLocation
	 * getX
	 * getY
	 * move
	 * setLocation
	 * setLocation
	 * setLocation
	 * translate
	 * ---------------------------------------------------
	 * Point Values vor der Änderung:
	 * getX: 1.0
	 * getY: 2.0
	 * Point Values nach der Änderung:
	 * getX: 30.0
	 * getY: 40.0
	 *
	 */
}