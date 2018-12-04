package curicculum;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.*;
public class cv {
	Scanner sc = new Scanner(System.in);
	private int i=0;
	private int h=0;
	private long id=0;
	private voci obj;
	private voci obj2;
	voci [] arrayVoci = new voci[50];
	voci[] array2Voci=new voci[50];
	public void aggiungiVoceL(voci v) {
		if (i>arrayVoci.length) {
			System.out.println("hai superato il max");
		} else {
			arrayVoci[i]=v;
			i++;
			
		}
		
		
	}
	public void aggiungiVoceS(voci v) {
		if (h>array2Voci.length) {
			System.out.println("hai superato il max");
		} else {
			array2Voci[h]=v;
			h++;
			
		}
		
		
	}
	
	public void rimuovi() {
		System.out.println("inserisci Id che vuoi togliere");
		id=sc.nextLong();
		for(int k=0;k<i;k++) {
			if (id==arrayVoci[k].getId()) {
				arrayVoci[k]=new voci(0, null, null, null);
				
			}
			if (id==array2Voci[k].getId()) {
				array2Voci[k]=new voci(0, null, null, null);
				
			}
		}
		
	}
	public void elenco() {
		for (int g=0; g<i;g++) {
			System.out.println(arrayVoci[g].toString());
		}
		for (int q=0; q<h;q++) {
			System.out.println(array2Voci[q].toString());
		
	}
	}
	public void stampa() {
		for (int j=0;j<i;j++) {
		for (int l=0;l<i;l++) {
			if(arrayVoci[l].getDataIniizio().compareTo(arrayVoci[l+1].getDataIniizio())<0) {
				obj=arrayVoci[l+1];
				arrayVoci[i+1]=arrayVoci[l];
				arrayVoci[l]=obj;
			}
			/*if(array2Voci[l].getDataIniizio().compareTo(array2Voci[l+1].getDataIniizio())<0) {
				obj2=arrayVoci[l+1];
				array2Voci[i+1]=array2Voci[l];
				array2Voci[l]=obj2;
			}*/
			
		}
			
		}
		for (int g=0; g<i;g++) {
			System.out.println(arrayVoci[g].toString());
		}
		for (int q=0; q<i;q++) {
			System.out.println(array2Voci[q].toString());
		}
		
	}
}
