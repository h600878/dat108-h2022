package no.hvl.dat108.f09;

import java.util.*;
import java.util.stream.Collectors;

public class Eksempel4 {

    public static void main(String[] args) {

        List<Utvikler> utviklere = Arrays.asList(
                new Utvikler("Arne", new HashSet<>(Arrays.asList("Java", "C"))),
                new Utvikler("Pere", new HashSet<>(Arrays.asList("Javascript", "C++"))),
                new Utvikler("Knut", new HashSet<>(List.of("Java"))),
                new Utvikler("Anne", new HashSet<>(Arrays.asList("Haskell", "C#", "Python"))),
                new Utvikler("Emma", new HashSet<>(Arrays.asList("Clojure", "Ruby", "C"))),
                new Utvikler("Lise", new HashSet<>(Arrays.asList("Java", "C")))
        );

        System.out.println("\nEn oversikt over hvilke utviklere som kan Java:");
        utviklere.stream()
                .filter(u -> u.getSpraak().contains("Java"))
                .forEach(System.out::println);

        System.out.println("\nNavnet på en utvikler som kan C#, eller \"INGEN\" om ingen kan C#:");
        String s = utviklere.stream()
                .filter(u -> u.getSpraak().contains("C#"))
                .map(Utvikler::getNavn)
                .findAny()
                .orElse("INGEN");
        System.out.println(s);

        System.out.println("\nEn sortert liste over alle programmeringsspråkene utviklerne kan:");
        Set<String> personer = utviklere.stream()
                .flatMap(u -> u.getSpraak().stream())
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(personer);

        System.out.println("\nHvilket språk flest utviklere kan (finner ett av dem):");

        System.out.println("\nHvilke(t) språk flest utviklere kan hvis det er flere:");
    }
}





