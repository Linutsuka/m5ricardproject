package P1;
import java.util.Scanner;
import java.util.Arrays;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INTRODUIR INFORMACIO SOBRE PILOTS
		//Nom	Dorsal	Numero Total	Equip	Carreras
		boolean sortir = true;
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("Guardar Informació - Menú \n");
			System.out.println("-----------------\n   *1*Pilots\n   *2*Circuits\n   *3*Curses\n-----------------");
			
			
			String entrar = lector.nextLine();
			switch(entrar) {
				case "1":
					System.out.println("Benvolgut  a Guardar Informació per sortir escriu la paraula 'sortir'");
					String word = "";
					while(!(word.equalsIgnoreCase("sortir"))) {
						System.out.println("- Nom del pilot a introduir // sortir -");
						String pilot = lector.nextLine();
						word = pilot;
						if(!(pilot.equalsIgnoreCase("sortir"))) {
							System.out.println("- Dorsal del pilot " + pilot + " -");
							int dorsal = 0; 
							boolean funciona = lector.hasNextInt();	 //TRUE SI ES INT .  FALSE SI ! ES INT
								if(funciona) { //SI ES TRUE ENTRA
								dorsal = lector.nextInt(); lector.nextLine(); //LI POSA VALOR NETEJA BUFFER
								}
								else {
									while((!funciona)) { //ENTRA SI ES FALS
											lector.nextLine();  System.out.println("- Nom del pilot a introduir // sortir -");		 //NETEJA EL BUFFER I PREGUNTA
											funciona = lector.hasNextInt(); //AGAFA EL NUMERO
											if(funciona) { // SI FUNCIONA ENTRA I POSA EL VALOR NETEJA BUFFER
												dorsal = lector.nextInt(); lector.nextLine();
											}
									}
								}	
								System.out.println("Número total de punts fins ara");
								int numeroTotal = 0; 
								funciona = lector.hasNextInt();	 //TRUE SI ES INT .  FALSE SI ! ES INT
									if(funciona) { //SI ES TRUE ENTRA
									numeroTotal = lector.nextInt(); lector.nextLine(); //LI POSA VALOR NETEJA BUFFER
									}
									else {
										while((!funciona)) { //ENTRA SI ES FALS
												lector.nextLine();  System.out.println("- Nom del pilot a introduir // sortir -");		 //NETEJA EL BUFFER I PREGUNTA
												funciona = lector.hasNextInt(); //AGAFA EL NUMERO
												if(funciona) { // SI FUNCIONA ENTRA I POSA EL VALOR NETEJA BUFFER
													numeroTotal = lector.nextInt(); lector.nextLine();
												}
										}
									}
									System.out.println("- Nom del equip del pilot " +  pilot + " -");
									String equip = lector.nextLine();
									
									System.out.println("Número de carreras del pilot "  + pilot + " -");
									int numeroCarreras = 0; 
									funciona = lector.hasNextInt();	 //TRUE SI ES INT .  FALSE SI ! ES INT
										if(funciona) { //SI ES TRUE ENTRA
										numeroCarreras = lector.nextInt(); lector.nextLine(); //LI POSA VALOR NETEJA BUFFER
										}
										else {
											while((!funciona)) { //ENTRA SI ES FALS
													lector.nextLine();  System.out.println("- Nom del pilot a introduir // sortir -");		 //NETEJA EL BUFFER I PREGUNTA
													funciona = lector.hasNextInt(); //AGAFA EL NUMERO
													if(funciona) { // SI FUNCIONA ENTRA I POSA EL VALOR NETEJA BUFFER
														numeroCarreras = lector.nextInt(); lector.nextLine();
													}
											}
										}
										
									System.out.println("**Introduint l'informació següent**\n " + pilot + " - " + dorsal + " - " +  numeroTotal +  " - "+equip +" - " + numeroCarreras);
									
									File f =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
									try {
										ArrayList<String> clonar = new ArrayList<String>();
										clonar = registre.guardarPilots(f);
										PrintStream writer = new PrintStream(f);
										for(int i = 0 ; i < f.length() ; i++ ) {
											writer.println(clonar.get(i));
										}
										writer.println(pilot + "-" + dorsal + "-" +  numeroTotal +  "-"+equip +"-" + numeroCarreras);
										writer.println("endFile");
										
									}
									catch(Exception e) {
										System.out.print("**Error el .java Info");
									}
						}
					}
					break;
				case"2":
					System.out.println("Benvolgut a Guardar Informació Circuits per sortir escriu la paraula 'sortir'");
					word = lector.nextLine().toLowerCase();
					while(!(word.equals("sortir"))) {
						System.out.println("Introdueix nom del Circuit");
						String nomCircuit = lector.nextLine();
						word = nomCircuit;
						if(!(word.equalsIgnoreCase("sortir"))) {
							System.out.println("Introdueix el ID de " + nomCircuit);
							String id = lector.nextLine();	
							
							System.out.println("**Introduint l'informació següent**\n " + nomCircuit + " - " + id);
							//CANVIAR NOM DEL ARXIU
							File f =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
							try {
								ArrayList<String> clonar = new ArrayList<String>();
								clonar = registre.guardarCircuit(f);
								PrintStream writer = new PrintStream(f);
								for(int i = 0 ; i < f.length() ; i++ ) {
									writer.println(clonar.get(i));
								}
								writer.println(nomCircuit + "-" + id);
								writer.println("endFile");
								
							}
							catch(Exception e) {
								System.out.print("**Error el .java Info");
							}
						}
					}
				case"3"://CURSES
					System.out.println("Benvolgut a Guardar Informació Curses per sortir escriu la paraula 'sortir'");
					word = lector.nextLine().toLowerCase();
					File f =new File ("C:"+File.separator+"fitxers"+File.separator+"m5pilots.txt");
					while(!(word.equals("sortir"))) {
						System.out.println("Introdueix nom de la Cursa");
						String nomCursa = lector.nextLine();
						word = nomCursa;
						if(!(word.equalsIgnoreCase("sortir"))) {
							System.out.println("Introdueix ID de " + nomCursa);
							String idCursa = lector.nextLine();
							System.out.println("Introdueix Data de la cursa DD/MM/YYYY");
							String dataCursa = lector.nextLine();
							System.out.println("Introdueix ID del Circuit");
							System.out.println(registre.guardarCurses(f));
							String idCurses = lector.nextLine();
							int j = 0;
							ArrayList<String> curses = new ArrayList<String>();
							curses = registre.guardarCurses(f);
							boolean existeix = false;
							while(!(existeix)) {
								String[] idCi =  new String[curses.size()];
								while(j < curses.size()) {
									String nom = curses.get(j);
									String separator[] = nom.split("-");
									idCi[j] = separator[1];
									j++;
								}
								System.out.println("Introdueix ID del Circuit");
								idCurses = lector.nextLine();
								while(j < curses.size()) {
									if(Arrays.asList(idCi).contains((idCurses))) {
										existeix = true;
									}
									j++;
								}
							}
						}
						
					}
					
					
			}
		}
		while(sortir);
		
		
	}
}
