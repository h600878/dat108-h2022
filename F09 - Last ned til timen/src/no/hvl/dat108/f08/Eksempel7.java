package no.hvl.dat108.f08;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * I dette eksemplet skal vi ...
 */
public class Eksempel7 {
	
	public static void main(String[] args) {
		
		//Skrive ut alle partall i området [1,10>
		System.out.println();
		IntStream.range(1, 10)
				.filter(x -> x % 2 == 0)
				.forEach(System.out::println);
		
		//Skrive ut kvadratet av alle tallene området [1,10>
		System.out.println();
		IntStream.range(1, 10)
				.map(x -> x * x)
				.forEach(System.out::println);

		
		//For en strøm av tallene 100, 103, 106, 109, ...
		//   skriv ut de 10 første som er delelig med 4
		Stream.iterate(100, x -> x + 3)
				.filter(x -> x % 4 == 0)
				.limit(10)
				.forEach(System.out::println);
		System.out.println();

		
		//For en stream av strenger, skriv dem ut sortert uten duplikater
		Stream.of("X", "A", "X", "P", "B")
				.distinct()
				.sorted()
				.forEach(System.out::print);
		System.out.println();
		
	}
}








