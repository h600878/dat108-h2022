package no.hvl.lph.dat108.f06;

import java.util.Arrays;
import java.util.List;

public class F06a {
	
	public static void main(String[] args) {
		
		//Sortere liste av heltall
		List<Integer> listeAvTall = Arrays.asList(4,2,7,5,9,1);
		sorter(listeAvTall);
		System.out.println("Sortert listeAvTall: " + listeAvTall);
		
		
		//Vi gjør resten i timen!

		
		//Sortere liste av strenger ...
		List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
		
		//Sortere liste av personer ...
		List<Person> listeAvPersoner = Arrays.asList(
				new Person("Anne", "Persen", 1985),
				new Person("Per", "Andersen", 1984),
				new Person("Knut", "Svendsen", 1990));
		
		//Ønsker å sortere på fornavn. Hva gjør vi?
		
		//Ønsker å sortere på fødselsår. Hva gjør vi?
		
	}
	
	//Laget denne på forhånd for å spare tid. En litt enkel boblesortering.
	private static void sorter(List<Integer> liste) {
		
		for (int i=0; i<liste.size(); i++) {
			for (int j=1; j<liste.size(); j++) {
				int a = liste.get(j-1);
				int b = liste.get(j);
				
				if (a > b) {
					
					liste.set(j-1, b);
					liste.set(j, a);
				}
			}
		}
	}
}
