package no.hvl.lph.dat108.f06;

import java.util.*;

public class F06b {

    public static void main(String[] args) {

        List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");

        // Sorterer etter String tallverdi
        Collections.sort(listen);
        System.out.println(listen);

        // Sorterer etter bokstaver
        listen.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(listen);

        // Lagre i variabel
        Comparator<String> paaLengdeSynkende = (a, b) -> a.length() - b.length();

        // Sorterer etter lengde
        listen.sort(paaLengdeSynkende);
        System.out.println(listen);

    }
}














