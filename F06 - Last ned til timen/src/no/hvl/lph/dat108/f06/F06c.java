package no.hvl.lph.dat108.f06;

import java.util.List;

public class F06c {

    public static void main(String[] args) {

        List<Integer> listen = List.of(-4, 9, 2, 7, 6, 0);

        // Filtrerer ut alle oddetall
        List<Integer> resultat = listen.stream().filter((i) -> i % 2 == 0).toList();
        System.out.println(resultat);
    }

}

