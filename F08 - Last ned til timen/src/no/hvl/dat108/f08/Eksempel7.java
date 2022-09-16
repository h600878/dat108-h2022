package no.hvl.dat108.f08;

import java.util.stream.IntStream;

/*
 * I dette eksemplet skal vi ...
 */
public class Eksempel7 {

    public static void main(String[] args) {

        // Skrive ut alle partall i området [1,10>
        IntStream.range(1, 10)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);

        System.out.println();
        //Skrive ut kvadratet av alle tallene området [1,10>
        IntStream.range(1, 10)
                .forEach(i -> System.out.println((int) Math.pow(i, 2)));

        System.out.println();
        //For en strøm av tallene 100, 103, 106, 109, ...
        //   skriv ut de 10 første som er delelig med 4

        System.out.println();
        //For en stream av strenger, skriv dem ut sortert uten duplikater

    }
}
