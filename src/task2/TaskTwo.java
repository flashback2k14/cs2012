package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskTwo {

	public static void main(String[] args) {
		// Dateipfade
		String pathInput = "F:\\Dokumente\\BA\\Sem2\\DV\\2012\\input.html";
		String pathOutput = "F:\\Dokumente\\BA\\Sem2\\DV\\2012\\output.html";
		// Erzeuge Datenobjekte
		File ip = new File(pathInput);
        File op = new File(pathOutput);

        try {
            // Erzeuge ungepufferte Streams.
            FileReader fr = new FileReader(ip);
            FileWriter fw = new FileWriter(op);
            // Erzeuge gepuffered Streams.
            // The second boolean parametre activates automatic flush,
            // executed for instance when calling "println".
            BufferedReader in = new BufferedReader(fr);
            PrintWriter out = new PrintWriter(fw, true);

            try {
                // Lese Zeile und Schreibe Inhalt in String
                String line = in.readLine();
                System.out.println("Begin Replacing...");
                // Ersetze solange Zeichen bis keine mehr gelesen werden
                while (line != null) {
                    line = line.replaceAll("�", "&auml;");
                    line = line.replaceAll("�", "&Auml;");
                    line = line.replaceAll("�", "&ouml;");
                    line = line.replaceAll("�", "&Ouml;");
                    line = line.replaceAll("�", "&uuml;");
                    line = line.replaceAll("�", "&Uuml;");
                    line = line.replaceAll("�", "&szlig;");
                    line = line.replaceAll("\"", "&quot;");
                    // Schreibe Zeile in Datei.
                    out.println(line);
                    // Lese n�chste Zeile
                    line = in.readLine();
                    System.out.println("Read next line.");
                }
                System.out.println("End Replacing!");
            } finally {
                // Schlie�e InputStream
                if (in != null) {
                    in.close();
                }
                // Schlie�e OutputStream
                if (out != null) {
                    out.close();
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
	
	/**
	 * Output
	 * 
	 *  Begin Replacing...
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		Read next line.
		End Replacing!
	 */
}