package no.hvl.lph.dat108.f06;

import java.util.Arrays;
import java.util.List;

public class F06a {

    public static void main(String[] args) {

        // Sortere liste av heltall
        List<Integer> listeAvTall = Arrays.asList(4, 2, 7, 5, 9, 1);
        sorter(listeAvTall);
        System.out.println("Sortert listeAvTall: " + listeAvTall);


        // Vi gjør resten i timen!


        // Sortere liste av strenger ...
        List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");

        // Sortere liste av personer ...
        List<Person> listeAvPersoner = Arrays.asList(
                new Person("Anne", "Persen", 1985),
                new Person("Per", "Andersen", 1984),
                new Person("Knut", "Svendsen", 1990)
        );

        // Sorterer på fornavn
        listeAvPersoner.sort((o1, o2) -> o1.fornavn.compareTo(o2.fornavn));
//        listeAvPersoner.sort(Comparator.comparing(o -> o.fornavn)); // Alternativ måte
        System.out.println(listeAvPersoner);

        // Sortrer på fødselsår
        listeAvPersoner.sort((o1, o2) -> o1.fodselsaar - o2.fodselsaar);
//        listeAvPersoner.sort(Comparator.comparingInt(o -> o.fodselsaar)); // Alternativ måte
        System.out.println(listeAvPersoner);
    }

    // Laget denne på forhånd for å spare tid. En litt enkel boblesortering.
    private static <T extends Comparable<? super T>> void sorter(List<T> liste) {

        for (int i = 0; i < liste.size(); i++) {
            for (int j = 1; j < liste.size(); j++) {
                T a = liste.get(j - 1);
                T b = liste.get(j);

                if (a.compareTo(b) > 0) {
                    liste.set(j - 1, b);
                    liste.set(j, a);
                }
            }
        }
    }
}
