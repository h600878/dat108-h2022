package no.hvl.dat108.f09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Eksempel4 {
	
	public static void main(String[] args) throws Exception {
		
		List<Utvikler> utviklere = Arrays.asList(
				new Utvikler("Arne", new HashSet<>(Arrays.asList("Java", "C"))),
				new Utvikler("Pere", new HashSet<>(Arrays.asList("Javascript", "C++"))),
				new Utvikler("Knut", new HashSet<>(Arrays.asList("Java"))),
				new Utvikler("Anne", new HashSet<>(Arrays.asList("Haskell", "C#", "Python"))),
				new Utvikler("Emma", new HashSet<>(Arrays.asList("Clojure", "Ruby", "C"))),
				new Utvikler("Lise", new HashSet<>(Arrays.asList("Java", "C"))));

		System.out.println(
				"\nEn oversikt over hvilke utviklere som kan Java:");
		List<Utvikler> deSomKanJava = utviklere.stream()
				.filter(u -> u.getSpraak().contains("Java"))
				.toList();
		deSomKanJava.forEach(System.out::println);
		
		System.out.println(
				"\nNavnet på en utvikler som kan C#, eller \"INGEN\" om ingen kan C#:");
		String navnCSharp = utviklere.stream()
				.filter(u -> u.getSpraak().contains("C#"))
				.map(u -> u.getNavn())
				.findAny()
				.orElse("INGEN");
		System.out.println(navnCSharp);

		System.out.println(
				"\nEn sortert liste over alle programmeringsspråkene utviklerne kan:");
		List<String> spraak = utviklere.stream()
				.flatMap(u->u.getSpraak().stream())
				.distinct()
				.sorted()
				.toList();
		System.out.println(spraak);

		System.out.println(
				"\nHvilket språk flest utviklere kan (finner ett av dem):");
		//Litt vrien - Prøv selv ...
		
		System.out.println(
				"\nHvilke(t) språk flest utviklere kan hvis det er flere:");
		//Litt vrien - Prøv selv ...
	}
}





