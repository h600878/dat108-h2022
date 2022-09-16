package no.hvl.dat108.f08;

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

		// 1 - Sortering på etternavn ved å gi inn en Comparator som 2. parameter
		people.sort(Comparator.comparing(Person::getLastName));
		
		// 2 - Ofte ser vi kode som dette
		people.sort(Comparator.comparing(Person::getLastName));

		// 3 - Eller uten å bruke metodereferanse
		people.sort(Comparator.comparing(Person::getLastName));

		// 4 - Hvordan virker egentlig Comparator.comparing()?
		//		Kan vi forstå litt mer ved å lage en slik metode selv?
		//		F.eks. slik (sortere på alder):
		people.sort(sammenligner(Person::getFirstName));
		System.out.println(people);
	}
	
	private static <T, U extends Comparable<? super U>> Comparator<T> sammenligner(Function<T, U> func) {
		return Comparator.comparing(func);
//		return (a, b) -> func.apply(a).compareTo(func.apply(b));
	}

}











