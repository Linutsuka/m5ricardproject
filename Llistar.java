package P1;
import java.util.Scanner;
import java.io.File;
public class Llistar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		boolean sortir =  false;
		do {
			System.out.println("Llistat Informaci� - Men�");
			String entrar = lector.nextLine();
			switch(entrar) {
			case"1"://PILOTS
				System.out.println("\t**Llistat de PILOTS**\n");
				File f =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
				int k = 0;	
				try {
					Scanner reader = new Scanner(f);
					while(k < f.length() ) {
						String word = reader.nextLine();
							if(!(word.equalsIgnoreCase("endFile"))){
								System.out.println(word);
							}
							k++;
					}
					
				}
				catch(Exception e) {
					System.out.println("Error llistar.java");
				}
				break;
			case"2"://CIRCUITS
				System.out.println("\t**Llistat de CIRCUITS");
				//CANVIAR EL NOM DEL ARXIU
				File f1 =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
				int p = 0;
				try {
					Scanner reader = new Scanner(f1);
					while(p < f1.length()) {
						String word = reader.nextLine();
						if(!(word.equalsIgnoreCase("endFile"))){
							System.out.println(word);
						}
						p++;
					}
				}
				catch(Exception e) {
					System.out.println("Error llistar.java");
				}
			case"3":
				System.out.println("\t**Llistat de CIRCUITS");
				//CANVIAR EL NOM DEL ARXIU
				File f2 =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
				int h = 0;
				try {
					Scanner reader = new Scanner(f2);
					while(h < f2.length()) {
						String word = reader.nextLine();
						if(!(word.equalsIgnoreCase("endFile"))){
							System.out.println(word);
						}
						h++;
					}
				}
					catch(Exception e) {
						System.out.println("Error llistar.java");
					}
				break;
			}	
		}
		while(sortir);
	}

}
