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
				System.out.println(registre.guardarPilots(f));
				
			}
			
			
		}
		while(sortir);
	}

}
