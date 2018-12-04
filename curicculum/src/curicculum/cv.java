package curicculum;
import java.util.*;
public class cv {
	Scanner sc = new Scanner(System.in);
	private int i=0;
	private long id=0;
	private voci obj;
	voci [] arrayVoci = new voci[50];
	
	public void aggiungiVoce(voci v) {
		if (i>arrayVoci.length) {
			System.out.println("hai superato il max");
		} else {
			arrayVoci[i]=v;
			i++;
			
		}
		
		
	}
	public void rimuovi() {
		System.out.println("inserisci Id che vuoi togliere");
		id=sc.nextLong();
		for(int k=0;k<i;k++) {
			if (id==obj.id) {
				
			}
		}
		
	}
	
}
