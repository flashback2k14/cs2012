package streamformatting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SFLauncher {

	public static void main(String[] args) {
	
		String pathInput = "F:/Dokumente/BA/Sem2/DV/2010/umsatz.txt";
		String pathOutput = "F:/Dokumente/BA/Sem2/DV/2010/umsatzliste.txt";
		
		try {
            BufferedReader in = new BufferedReader(new FileReader(pathInput));
            PrintWriter out = new PrintWriter(new FileWriter(pathOutput), true);
            //
            out.println("Umsatzliste");
            out.println("===========");
            out.println();
            //
            String line;
            double sum = 0;
            //
            while ((line = in.readLine()) != null) {
            	//
                double z = 0;
                //
                try {
                    z = Double.parseDouble(line);
                } catch (NumberFormatException e) {  
                    continue;
                }
                //
                sum += z; 
                out.println("€ " + z);
            }
            //
            out.println();
            out.println("Summe: € " + sum);
            in.close();
            out.close();       
        } catch (IOException e) {
            System.err.println(e);
        }
	}
	
	/**
	 * Input:
	 * 
	 * 1000.55
	 * 1234.99
	 * xxxxxxx
	 * 2000.00
	 * 3100.00
	 * 
	 */
	
	/**
	 * Output:
	 * 
	 * Umsatzliste
	 * ===========
	 *
	 * € 1000.55
	 * € 1234.99
	 * € 2000.0
	 * € 3100.0
	 * 
	 * Summe: € 7335.54
	 *
	 */
}