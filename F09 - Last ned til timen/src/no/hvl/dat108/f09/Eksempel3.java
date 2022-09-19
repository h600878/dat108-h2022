package no.hvl.dat108.f09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Eksempel3 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Alle forbokstavene i fornavnene i en streng - reduce "CLTCM"
        String forbokstaver = people.stream()
                .map(person -> person.getFirstName().charAt(0) + "")
                .collect(Collectors.joining());

        System.out.println(forbokstaver);

        // Antall personer - count
        long antall = people.stream().count();
        System.out.println(antall);

        // Om vi har data som matcher - anyMatch, allMatch, noneMatch
        // Er alle over 30 år?
        boolean alle = people.stream().allMatch(person -> person.getAge() > 30);
        System.out.println(alle);

        // Er noen over 60 år?
        boolean noen = people.stream().anyMatch(person -> person.getAge() > 60);
        System.out.println(noen);

        // Summen av alle tall i [1..100]
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println(sum);

        // Det minste tallet i streamen ...
        int min = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .getAsInt();
        System.out.println(min);

        // Finn en som er 30 eller yngre
        Person p = people.stream()
                .filter(person -> person.getAge() <= 30)
                .findFirst()
                .orElse(null); // Hvis det ikke finnes et element i findFirst(), returner 'null'
        System.out.println(p);
    }
}
