package no.hvl.dat108.f06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class F06a {

    public static void main(String[] args) {

        // Sortere liste av heltall.
        List<Integer> listeAvTall = Arrays.asList(4, 2, 7, 5, 9, 1);
        sorter(listeAvTall);
        System.out.println("Sortert listeAvTall: " + listeAvTall);

        // Sortere liste av strenger.
        // Må bruke comareTo(), generics og typeparameter T extends Comparable<T>.
        List<String> listeAvString = Arrays.asList("Aaa", "Xxx", "Bbb", "Kkk");
        sorter(listeAvString);
        System.out.println("Sortert listeAvString: " + listeAvString);

        // Sortere liste av personer på etternavn.
        // Person implementerer Comparable<Person>.
        List<Person> listeAvPersoner = Arrays.asList(
                new Person("Anne", "Persen", 1985),
                new Person("Per", "Andersen", 1984),
                new Person("Knut", "Svendsen", 1990));
        sorter(listeAvPersoner);
        System.out.println("Sortert listeAvPersoner: " + listeAvPersoner);

        // Ønsker å sortere på fornavn. Hva gjør vi?
        // Angir dette via en ekstra parameter som angir hvordan det skal sammenlignes.
        sorter(listeAvPersoner, (a, b) -> a.fornavn.compareTo(b.fornavn));
        System.out.println("Sortert listeAvPersoner: " + listeAvPersoner);

        // Ønsker å sortere på fødselsår. Hva gjør vi?
        // Samme her, nå som anonym klasse.
        sorter(listeAvPersoner, (a, b) -> a.fodselsaar - b.fodselsaar);
        System.out.println("Sortert listeAvPersoner: " + listeAvPersoner);
    }


    // Den "gamle" metoden, nå som et kall til den nye for å slippe duplikatkode
    private static <T extends Comparable<T>> void sorter(List<T> liste) {
        sorter(liste, (a, b) -> a.compareTo(b));
    }

    // Den nye metoden med en ekstra Sammenligner-parameter
    private static <T extends Comparable<T>> void sorter(List<T> liste, Comparator<T> s) {

        for (int i = 0; i < liste.size(); i++) {
            for (int j = 1; j < liste.size(); j++) {
                T a = liste.get(j - 1);
                T b = liste.get(j);

                if (s.compare(a, b) > 0) {
                    liste.set(j - 1, b);
                    liste.set(j, a);
                }
            }
        }
    }
}
