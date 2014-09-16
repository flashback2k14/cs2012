package task1;

import java.io.File;

public class TaskOne {

	public static void getFileInfo(File file) {
		System.out.println("Dateiname: " + file.getName());
		System.out.println("ist Datei: " + file.isFile());
		System.out.println("ist Verzeichnis: " + file.isDirectory());
		System.out.println("ist versteckt: " + file.isHidden());
		System.out.println("ist schreibbar: " + file.canWrite());
		System.out.println("ist lesbar: " + file.canRead());
		System.out.println("ist ausführbar: " + file.canExecute());
		System.out.println("------------------------------------");
	}
	
	public static void main(String[] args) {

		String directoryPath = "c:\\windows\\help\\";
		//
		File file = new File(directoryPath);
		//
		if (file.exists()) {
			//
			File[] fileList = file.listFiles();
			//
			for (File f : fileList) {
				getFileInfo(f);
			}
			//
			System.out.println("Anzahl der Dateien / Verzeichnisse: " + fileList.length);
			System.out.println("------------------------------------");
			//
			System.out.println("Freier Speicherplatz in Byte: " + file.getFreeSpace());
		} else {
			System.out.println("Datei oder Verzeichnis existiert nicht.");
		}
	}
	
	/**
	 * Output
	 * 
	 * Dateiname: OEM
	 * ist Datei: false
 	 * ist Verzeichnis: true
	 * ist versteckt: false
	 * ist schreibbar: true	
	 * ist lesbar: true
	 * ist ausführbar: true
 	 * ------------------------------------
	 * Dateiname: Windows
	 * ist Datei: false
	 * ist Verzeichnis: true
	 * ist versteckt: false
	 * ist schreibbar: true
	 * ist lesbar: true
	 * ist ausführbar: true
	 * ------------------------------------
	 * Anzahl der Dateien / Verzeichnisse: 2
	 * ------------------------------------
	 * Freier Speicherplatz in Byte: 170884235264
	 * 
	 */
}