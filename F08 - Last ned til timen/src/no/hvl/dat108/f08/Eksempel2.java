package no.hvl.dat108.f08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * I dette eksemplet skal vi gjøre om (a,b) -> a.compareTo(b)
 * til en metodereferanse.
 */
public class Eksempel2 {

    /**
     * En variant av sorter som bruker a.compareTo(b)
     */
    private static <T extends Comparable<T>> void sorter(List<T> liste) {
        sorter(liste, T::compareTo);
    }

    /**
     * En variant av sorter som bruker s.sammenlign(a,b)
     */
    private static <T> void sorter(List<T> liste, Comparator<T> c) {

        for (int i = 0; i < liste.size(); i++) {
            for (int j = 1; j < liste.size(); j++) {
                T a = liste.get(j - 1);
                T b = liste.get(j);

                if (c.compare(a, b) > 0) { // <--- Her

                    liste.set(j - 1, b);
                    liste.set(j, a);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Person> listeAvPersoner = Arrays.asList(new Person("Anne", "Persen", 25), new Person("Per", "Andersen", 26), new Person("Knut", "Svendsen", 27));

        sorter(listeAvPersoner);
        System.out.println("Sortert på etternavn ved å bruke compareTo");
        System.out.println(listeAvPersoner);

        System.out.println("Sortert på fornavn ved å bruke Comparator");
        sorter(listeAvPersoner, Comparator.comparing(Person::getFirstName));
        System.out.println(listeAvPersoner);

    }
}

