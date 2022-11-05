package no.hvl.dat108.f15d;

import no.hvl.dat108.f15c.Bruker;
import no.hvl.dat108.f15util.PassordUtil;

public class PassordIWebapp {

    public static void main(String[] args) {

        /*
         * Dette er en demo av hvordan PassordUtil kan brukes i en webapp.
         *
         * En bruker registrerer seg med brukernavn og passord. Et brukerobjekt med
         * brukernavn og hashet passord lagres i databasen. Brukeren blir logget på.
         *
         * Tiden går ... og brukeren er logget ut.
         *
         * Bruker ønsker å logge inn igjen, og oppgir brukernavn og loginnPassord. Et
         * brukerobjekt blir hentet fra databasen basert på oppgitt brukernavn.
         * loginnPassord sammenlignes med det lagrede hashede passordet for denne
         * brukeren, osv ...
         *
         * NB! Sjekk innholdet i metodene PassordUtil.hashMedSalt() og
         * PassordUtil.validerMedSalt(). De er pensum!!!
         */

        // Bruker registrerer seg på nettsiden og trykker "Submit"
        final String brukernavn = "Per";
        final String passord = "1234567890";

        /*
         En en doPost() på serveren gjøres dette ...
         Validerer brukernavn og passord
         Her bør man kanskje kreve at passordet:
         - Er over en viss lengde, f.eks. 8 tegn
         - Ikke finnes i liste over x mest brukte passord
         ...
         Oppretter Bruker-objekt
         NB! Slik Bruker-klassen og konstruktøren til Bruker er laget
             er det IKKE passordet i klartekst som blir lagret!, men
             et tilfeldig salt og hashet passord.
             ALDRI lagre passord i klartekst!!!
             Det er mulig at det hadde vært bedre om konstruktøren hadde
             brukernavn, salt og hash som parametre dirtekte.
        */

        final Bruker bruker = new Bruker(brukernavn, passord);

        // Litt utskrift ...
        System.out.println(bruker);

        // Deretter lagres den nye brukeren i databasen
        // og brukeren blir f.eks. logget inn.


        // ... tiden går ...


        // Nå prøver bruker å logge inn igjen
//		String loginnBrukernavn = "Per";
//        final String loginnPassord = "hallo"; // Feil passord
        final String loginnPassord = "1234567890"; // Riktig passord

        // Bruker med brukernavn "Per" blir hentet fra databasen

        // og man sjekker om det er en match på passordet
        final String salt = bruker.getSalt();
        final String hashetPassord = bruker.getPassordhash();

        if (PassordUtil.validerMedSalt(loginnPassord, salt, hashetPassord)) {
            System.out.println("\n" + loginnPassord + " var riktig passord. Innlogging OK.");
        }
        else {
            System.out.println("\n" + loginnPassord + " var feil passord. :(");
        }

    }
}
