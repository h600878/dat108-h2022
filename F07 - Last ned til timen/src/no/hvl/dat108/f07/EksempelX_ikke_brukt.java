package no.hvl.dat108.f07;

import java.util.Arrays;
import java.util.List;

public class EksempelX_ikke_brukt {

	public static void main(String[] args) {

		List<String> tekster = Arrays.asList("Atle", "Lars", "Per");

		// Predicate<T>
		// Vi kan f.eks. lage en metode printKunDeSomErGyldige() som tar inn
		// en liste av strenger og kun printer ut de som oppfyller en betingelse.

		// Consumer<T>
		// Vi kan f.eks. lage en metode gjorNoeMedAlleTekstene() som tar inn
		// en liste av strenger og gjør noe (angitt i en lambda) med hver enkelt av dem.

		// Supplier<T>
		// Vi kan f.eks. lage en metode produserListeAvVerdier som returner en
		// en liste av produserte verdier (angitt i en lambda).

		// Function<T, R>
		// Vi kan f.eks. lage en metode finnOgPrintNoeInfoOmTekstene() som tar inn
		// en liste av strenger og finner (angitt i en lambda) og printer ut noe 
		// statistikk om hver enkelt streng.
	}

}
