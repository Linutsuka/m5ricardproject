
package P1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class registre {
	File f =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
	File f1 =new File ("C:"+File.separator+"fitxers"+File.separator+"m5circuits.txt");
	public static void main(String[] args) {
		

	}
	static void guardarMemoria2(File f2) {
		ArrayList<String> nom = new ArrayList<String>();
		ArrayList<Integer> id =  new ArrayList<Integer>();
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<Integer> idCircuits =  new ArrayList<Integer>();
		
		try {
			Scanner lectorF = new Scanner(f2);
			boolean noAcaba = true; int k = 0;
			while(noAcaba) { 
				String word = lectorF.nextLine();
				if(!(word.equalsIgnoreCase("endFile"))) {
					String[] separator = word.split("-");
					nom.add(separator[0]);
					id.add(Integer.parseInt(separator[1]));
					data.add(separator[2]);
					idCircuits.add(Integer.parseInt(separator[2]));
				
					k++;
				}
				if(word.equalsIgnoreCase("endFile")) {
					noAcaba=false;
				
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error guardarMemoria1");
		}
		
		
		
		
	}
	
	static void guardarMemoria1 (File f1) {
		ArrayList<String> nom = new ArrayList<String>();
		ArrayList<Integer> id =  new ArrayList<Integer>();
		try {
			Scanner lectorF = new Scanner(f1);
			boolean noAcaba = true; int k = 0;
			while(noAcaba) { 
				String word = lectorF.nextLine();
				if(!(word.equalsIgnoreCase("endFile"))) {
					String[] separator = word.split("-");
					nom.add(separator[0]);
					id.add(Integer.parseInt(separator[1]));
				
					k++;
				}
				if(word.equalsIgnoreCase("endFile")) {
					noAcaba=false;
				
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error guardarMemoria1");
		}
		
		
		
	}
	static void guardarMemoria (File f) {
		ArrayList<String> nom = new ArrayList<String>();
		ArrayList<Integer> numeroTotal = new ArrayList<Integer>();
		ArrayList<Integer> carreras = new ArrayList<Integer>();
		ArrayList<Integer> dorsal = new ArrayList<Integer>();
		ArrayList<String> equip = new ArrayList<String>();
		try {

		Scanner lectorF = new Scanner(f);
		
		boolean noAcaba = true; int k = 0;
		
			while(noAcaba) { 
				String word = lectorF.nextLine();
				if(!(word.equalsIgnoreCase("endFile"))) {
					String[]separator = word.split("-");
					nom.add(separator[0]);
					dorsal.add(Integer.parseInt(separator[1]));
					numeroTotal.add(Integer.parseInt(separator[2]));
					equip.add(separator[3]);
					carreras.add(Integer.parseInt(separator[4]));
					
				
					k++;
				}
				if(word.equalsIgnoreCase("endFile")) {
					noAcaba=false;
				
				}
			}
		}
		catch(Exception e ) {
			System.out.println("Error en guardarMemoria");
		}
		
	}
		static void registre()  {
	}
		 
		
	}
