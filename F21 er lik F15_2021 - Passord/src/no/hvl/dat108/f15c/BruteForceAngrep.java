package no.hvl.dat108.f15c;

import no.hvl.dat108.f15util.PassordUtil;

public class BruteForceAngrep {

    public static void main(String[] args) {
        
        String passord = "Abc";
        
        String salt = PassordUtil.genererTilfeldigSalt();
        String hash = PassordUtil.hashMedSalt(passord, salt);
        
        long antallPassordSjekket = 0;

        long start = System.currentTimeMillis();
        
        boolean ferdig = false;
        for (char c1='0'; c1<='z' && !ferdig; c1++) {
            System.out.print(".");
            for (char c2='0'; c2<='z' && !ferdig; c2++) {
                for (char c3='0'; c3<='z' && !ferdig; c3++) {
                	antallPassordSjekket++;
                    String p = "" + c1 + c2 + c3;
                    if (PassordUtil.validerMedSalt(p, salt, hash)) {
                        System.out.println("\nPassordet er " + p);
                        ferdig = true;
                    }
                }
            }
        }
        
        long stopp = System.currentTimeMillis();
        
        System.out.println("Antall passord sjekket: " + antallPassordSjekket);
        System.out.println("Tid i sekunder: " + (stopp-start)/1_000);
    }
}
