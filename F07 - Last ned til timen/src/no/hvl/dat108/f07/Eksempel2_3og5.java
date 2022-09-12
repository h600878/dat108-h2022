package no.hvl.dat108.f07;
/* Kopiert fra javabrains.io sitt Java 8 Lambda Basics kurs */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
        people.sort(Comparator.comparing(Person::getLastName)); // Alternativt: (o1, o2) -> o1.getLastName().compareTo(o2.getLastName())

        // 2: Skriv ut alle personene, én linje per person.
        // 		Lag en egen hjelpemetode printAll(...) som gjør dette.
        System.out.println("Alle");
        printConditionally(people, p -> true, System.out::println);

        // 3: Skriv ut alle personene som har etternavn som begynner på C.
        //		Lag en egen hjelpemetode printLastNameStartsWithC(...) som gjør dette.
        System.out.println("Etternavn som starter på C");
        printConditionally(people, p -> p.getLastName().toUpperCase().startsWith("C"), p -> System.out.println(p.getLastName()));

        // 4: Skriv ut alle personene som har fornavn som begynner på C.
        //		Vi ser nå at det er tungvint å lage én utskriftsmetode per
        //      spesialtilfelle. Lag en generell hjelpemetode printConditionally(...)
        //		gjør jobben i stedet. Denne tar inn listen + et lambdauttrykk.
        System.out.println("Fornavn som starter på C");
        printConditionally(people, p -> p.getFirstName().toUpperCase().startsWith("C"), p -> System.out.println(p.getFirstName()));

        // Eks.5
        // Sortere på alder. Tre skritt m/aldersforskjell
        // Vise alternativ til løkke
        // Husk metodereferanser
        System.out.println("Sortert etter alder og over 50");
        people.sort(Comparator.comparingInt(Person::getAge));
        printConditionally(people, p -> p.getAge() > 50, p -> System.out.println(p.getAge()));
    }

    private static void printConditionally(List<Person> liste, Predicate<Person> betingelse, Consumer<Person> consumer) {
        for (Person p : liste) {
            if (betingelse.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
