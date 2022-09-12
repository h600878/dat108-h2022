package no.hvl.dat108.f06;

import java.util.ArrayList;
import java.util.List;

interface Betingelse {
	boolean erOppfylt(int x);
}

public class F06c {
	
	public static List<Integer> plukkUt(List<Integer> liste, Betingelse betingelse) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(betingelse.erOppfylt(tall)) {
				svar.add(tall);
			}
		}
		return svar;
	}
	
	public static void main(String[] args) {
		
		List<Integer> listen = List.of(-4, 9, 2, 7, 6, 0);
		
		List<Integer> resultat;
		
		resultat = plukkUt(listen, x -> x % 2 == 0); //Alle partall
		System.out.println(resultat);
		
		resultat = plukkUt(listen, x -> x > 3); //Alle tall > 3
		System.out.println(resultat);
		
	}
}

