package no.hvl.dat108.oppgave;

import java.util.List;
import java.util.function.Predicate;

/*
 * Her er en liten oppgave dere kan prøve selv til mandag for å se
 * om dere har fått med dere hovedideen med lambda-uttrykk.
 *
 * Oppgavetekst:
 *
 * Lag en generell metode betingetUtskrift(...) som tar inn en streng
 * og et (false | true) lambda-uttrykk og som skriver ut strengen kun
 * hvis uttrykket er sant.
 *
 * Lag en main(...)-metode som tester dette ut med et par ulike input,
 * f.eks. krav om at stringen begynner på "X" eller at den er lengre
 * enn 3 tegn.
 */

import java.util.function.Predicate;

public class OppgaveBetingetUtskrift {

    private static <T> void betingetUtskrift(T o, Predicate<T> b) {
        if (b.test(o)) {
            System.out.println(o);
        }
        else {
            System.out.println("Ugyldig input");
        }
    }

    public static void main(String[] args) {
        String[] strenger = {"Betinget", "betinget", "Hallo", "Martin", "hallo", ""};
        for (String streng : strenger) {
            betingetUtskrift(streng, s -> s.length() > 0 && s.charAt(0) >= 65 && s.charAt(0) <= 90);
        }
    }
}
