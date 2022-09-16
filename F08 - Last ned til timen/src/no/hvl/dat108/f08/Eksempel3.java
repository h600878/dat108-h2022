package no.hvl.dat108.f08;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
 * I dette eksempelet skal vi se litt på metoden comparing(), og hvordan
 * denne kan brukes der det forventes en Comparator.
 */
public class Eksempel3 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		//1 - Sortering på etternavn ved å gi inn en Comparator som 2. parameter
		Collections.sort(people, (a,b) -> a.getLastName().compareTo(b.getLastName()));
		
		//2 - Ofte ser vi kode som dette
		Collections.sort(people, comparing(p -> p.getLastName()));

		//3 - Eller (enda bedre) ved å bruke metodereferanse
		Collections.sort(people, comparing(Person::getLastName));

		//4 - Hvordan virker egentlig Comparator.comparing()?
		//		Kan vi forstå litt mer ved å lage en slik metode selv?
		
//		Collections.sort(people, vedAaSammenligne(Person::getAge));
		Collections.sort(people, vedAaSammenligne(Person::getFirstName));
		
		System.out.println(people);

	}
	
	/*
	 * Vår egen utgave av Comparator.comparing(...). Gjort og forklart i timen
	 * Sjekk gjerne ut API-doc til Comparator.comparing(), og se om det ligner.
	 */
	static <T,U extends Comparable<U>> Comparator<T> vedAaSammenligne(Function<T, U> xtractor) {
		
		return (p1,p2) -> xtractor.apply(p1).compareTo(xtractor.apply(p2));
	}

}



















