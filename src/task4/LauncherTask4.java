package task4;

import java.util.ArrayList;

public class LauncherTask4 {

	public static void main(String[] args) {
		//
		Kueche kueche = new Kueche();
		Raum raum = new Raum();
		ArrayList<Rolle> anList = new ArrayList<Rolle>();
		//
		Koch koch = new Koch("Koch 1");
		TellerWaescher tellerWaescher = new TellerWaescher("Tellerwaescher 1");
		//
		anList.add(koch);
		anList.add(tellerWaescher);
		//
		Mensa mensa = new Mensa(anList, null, raum, kueche);
		Mensa mensa2 = mensa.clone();
		//
		System.out.println(mensa.toString());
		System.out.println(mensa2.toString());
	}
	
	/**
	 * Output
	 * 
	 *  Mensa class task4.Mensa
		[angestellte=[task4.Koch@4daaf194, task4.TellerWaescher@11da5362]
		, getraenkeBar=null
		, speiseSaal=task4.Raum@14985016
		, kueche=task4.Kueche@1bb1deea]
		
		Mensa class task4.Mensa
		[angestellte=[task4.Koch@3aa1e2da, task4.TellerWaescher@5a347448]
		, getraenkeBar=null
		, speiseSaal=task4.Raum@29be513c
		, kueche=task4.Kueche@dc74f8d]
	 */
}