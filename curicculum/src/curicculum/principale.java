package curicculum;
import java.util.*;
import java.time.LocalDate;
public class principale {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pick;
		int scelta=0;
		long id;
		LocalDate dataInzio;
		LocalDate dataFine;
		String descrizione;
		
		int finale=0;
		while(finale==0) {
		System.out.println("0)Exit");
		System.out.println("1)Inserimento CV");
		System.out.println("2)Elenco");
		System.out.println("3)Posti");
		System.out.println("4)Togliere");
		pick=input.nextInt();
		switch(pick) {
		case 0: finale=1;
				break;
		case 1: 
			System.out.println("Scegli:");
			System.out.println("1)Esperienza Lavorativa");
			System.out.println("2)Studio Effetuato");
			scelta=input.nextInt();
			if (scelta==1) {
				System.out.println("1)Inserisci ID");
				id=input.nextLong();
				System.out.println("2)Inserisci Data Inizio");

			}
			
				break;
		case 2: 
			
			
				break;
		case 3: 
			
			
				break;
		case 4: 
			
			
				break;
		
		}
		
		}
	}

}
