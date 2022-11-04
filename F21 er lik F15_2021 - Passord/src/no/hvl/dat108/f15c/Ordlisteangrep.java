package no.hvl.dat108.f15c;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import no.hvl.dat108.f15util.Filhjelper;
import no.hvl.dat108.f15util.PassordUtil;

public class Ordlisteangrep {

    public static void main(String... blablabla) throws IOException {

        /*
         * Fra https://github.com/danielmiessler/SecLists/tree/master/Passwords/Common-Credentials
         * Har kopiert en liste med de 10000 mest populære passordene.
         */
        final List<String> passordliste = Filhjelper.lesInnPassordFraFil("10000passord.txt");

        /*
         * Noen oppdiktede brukere. Alle blir lagret med saltet, stretched og hashed passord.
         */
        final List<Bruker> brukerliste = Arrays.asList(
                new Bruker("atle", "passord"),
                new Bruker("brit", "qwerty"),
                new Bruker("carl", "sdfkjsd lfkj sdf"),
                new Bruker("dina", "123456"),
                new Bruker("erik", "HaLlO"),
                new Bruker("fred", "Hei på deg"),
                new Bruker("geir", "madmax"),
                new Bruker("hans", "vladimir"),
                new Bruker("inge", "Liverpool"),
                new Bruker("jens", "liverpool")
        );

        for (String passord : passordliste) {
            for (Bruker bruker : brukerliste) {
                if (PassordUtil.validerMedSalt(passord, bruker.getSalt(), bruker.getPassordhash())) {
                    System.out.println(bruker.getBrukernavn() + " har passord '" + passord + "'");
                }
            }
        }
        System.out.println("Ferdig");
    }
}
