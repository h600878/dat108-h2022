package no.hvl.dat108.f06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class F06b {

	public static void main(String[] args) {

		List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");
		Collections.sort(listen);
		System.out.println(listen);
		
		//Alfabetisk uavhengig av store og små???
//		Collections.sort(listen, new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				return a.compareToIgnoreCase(b);
//			}
//		});
//		System.out.println(listen);
		
		//Nå med lambda-uttrykk
		Collections.sort(listen, (a, b) -> a.compareToIgnoreCase(b));
		System.out.println(listen);
		
		//Sortere på lengden på stringene
		Collections.sort(listen, (a, b) -> a.length() - b.length());
		System.out.println(listen);
		
		//Putte inn i variabel
		Comparator<String> paaLengdeSynkende = (a, b) -> b.length() - a.length();
		Collections.sort(listen, paaLengdeSynkende);
		System.out.println(listen);
	}
}

