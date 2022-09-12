package no.hvl.dat108.f06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class F06c {

    public static List<Integer> plukkUt(List<Integer> liste, Predicate<Integer> betingelse) {

        List<Integer> svar = new ArrayList<>();
        for (int tall : liste) {
            if (betingelse.test(tall)) {
                svar.add(tall);
            }
        }
        return svar;
    }

    public static void main(String[] args) {

        List<Integer> listen = List.of(-4, 9, 2, 7, 6, 0);

        List<Integer> resultat;

        resultat = plukkUt(listen, x -> x % 2 == 0); // Alle partall
        System.out.println(resultat);

        resultat = plukkUt(listen, largerThan(3)); // Alle tall > 3
        System.out.println(resultat);

        resultat = plukkUt(listen, largerThan(6)); // Alle tall > 6
        System.out.println(resultat);

        resultat = plukkUt(listen, largerThan(7)); // Alle tall > 7
        System.out.println(resultat);
    }

    private static Predicate<Integer> largerThan(int verdi) {
        return x -> x > verdi;
    }
}
