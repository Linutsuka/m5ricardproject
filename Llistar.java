package P1;
import java.util.Scanner;
import java.io.File;
public class Llistar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		boolean sortir =  false;
		do {
			System.out.println("Llistat Informació - Menú");
			String entrar = lector.nextLine();
			switch(entrar) {
			case"1"://PILOTS
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
			case"2"://CIRCUITS
			
			}	
		}
		while(sortir);
	}

}
