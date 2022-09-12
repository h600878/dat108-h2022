package no.hvl.dat108.f07;
/* Kopiert fra javabrains.io sitt Java 8 Lambda Basics kurs */

import java.util.Arrays;
import java.util.List;

public class Eksempel2_3og5 {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		// 1: Sorter personene på etternavn.

		
		// 2: Skriv ut alle personene, én linje per person. 
		// 		Lag en egen hjelpemetode printAll(...) som gjør dette. 
		
		
		// 3: Skriv ut alle personene som har etternavn som begynner på C.
		//		Lag en egen hjelpemetode printLastNameStartsWithC(...) som gjør dette. 
		
		
		// 4: Skriv ut alle personene som har fornavn som begynner på C.
		//		Vi ser nå at det er tungvint å lage én utskriftsmetode per
		//      spesialtilfelle. Lag en generell hjelpemetode printConditionally(...)
		//		gjør jobben i stedet. Denne tar inn listen + et lambdauttrykk.
		
		// 5: Skriv ut ALLE personene ved å bruke printConditionally(...)
		
		//Eks.5
		//Sortere på alder. Tre skritt m/aldersforskjell
		//Vise alternativ til løkke
		//Husk metodereferanser
	}
}
