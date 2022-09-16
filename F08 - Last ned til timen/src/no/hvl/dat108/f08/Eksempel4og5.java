package no.hvl.dat108.f08;

import java.util.Arrays;
import java.util.List;

public class Eksempel4og5 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		//1 - Skrive ut alle med fornavn som begynner på "C"

		//Gamlemåten:		
//		for (Person p : people) {
//			if (p.getFirstName().startsWith("C")) {
//				System.out.println(p);
//			}
//		}
		
		//Med streams:
		people.stream()
				.filter(p -> p.getFirstName().startsWith("C"))
				.forEach(System.out::println);

		
		//2 - Lage en liste av etternavnene til de som er over 50 år
		
		//Gamlemåten:		
//		List<String> etternavnene = new ArrayList<>();
//		for(Person p : people) {
//			if (p.getAge() > 50) {
//				etternavnene.add(p.getLastName());
//			}
//		}
//		System.out.println(etternavnene);
		
		//Med streams:							// Ligner på SQL !!		
		List<String> etternavnene = people.stream() //From people
				.filter(p -> p.getAge() > 50)		//Where age > 50
				.map(Person::getLastName)			//Select lastName
//				.collect(Collectors.toList());	// I Java 15-
				.toList(); 						// I Java 16+ kan du skrive toList() direkte
		
		System.out.println(etternavnene);
	}

}














