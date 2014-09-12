package task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TaskOne {

	public static void main(String[] args) {

		RandomAccessFile accessFile = null;
		RandomAccessFile accessFileRead = null;
		String path = "E:\\workspaceBA\\CS2011KlausurAH\\src\\task1\\TaskOne.txt";
		String output = "";
		
		try {
			accessFile = new RandomAccessFile(path, "rw");
			accessFile.writeUTF("Hallo World!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				accessFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			accessFileRead = new RandomAccessFile(path, "rw");
			output = accessFileRead.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				accessFileRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(changePosition(output));
		System.out.println(changePosition2(output));
	}
	
	public static String changePosition(String s) {
		String[] tmp = s.split("\\s");
		StringBuilder sb = new StringBuilder();
		
		for (int i = tmp.length; i > 0; i--) {
			sb.append(tmp[i-1]).append(" ");
		}
		
		return sb.toString();
	}
	
	/**
	 * nicht gefordert
	 */
	public static String changePosition2(String s) {
		char[] tmp = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = tmp.length; i > 0; i--) {
			sb.append(tmp[i-1]);
		}
		
		return sb.toString();
	}
}