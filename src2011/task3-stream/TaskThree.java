package task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskThree {

	public static void main(String[] args) {
		String pathInput = "F:\\Dokumente\\BA\\Sem2\\DV\\2011\\ba_in.bmp";
		String pathOutput = "F:\\Dokumente\\BA\\Sem2\\DV\\2011\\ba_out.bmp";
		//
		File fileInput = new File(pathInput);
		File fileOutput = new File(pathOutput);
		//
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		//
		int byteCounter = 0;
		//
		try {
			inputStream = new FileInputStream(fileInput);
			outputStream = new FileOutputStream(fileOutput);
			//
			System.out.println("Beginne Lese / Schreibvorgang");
			//
			int gelesenesZeichen = inputStream.read();
			//
			while (gelesenesZeichen != -1) {
				//
				switch (byteCounter) {
				case 22:
					gelesenesZeichen = 110;
					break;

				case 23:
					gelesenesZeichen = 0;
					break;
					
				case 24:
					gelesenesZeichen = 0;
					break;
					
				case 25:
					gelesenesZeichen = 0;
					break;
					
				case 58:
					gelesenesZeichen = 0;
					break;
					
				case 59:
					gelesenesZeichen = 0;
					break;
					
				case 60:
					gelesenesZeichen = 255;
					break;
					
				default:
					break;
				}
				// Schreibe Byte in Output Stream + Korrektur
				outputStream.write(gelesenesZeichen);
				// Gehe zum nächsten Zeichen
				gelesenesZeichen = inputStream.read();
				// Erhöhe den Counter um 1
				byteCounter++;
			}
			//
			System.out.println("Ende Lese / Schreibvorgang");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}