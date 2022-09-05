package ex1_stateless;

public class MainStateless {

    public static void main(String[] args) {

        // Eksemplet gir 240,57 kr som avrundes til 241 kr.
        final int STYKKPRIS = 99;
        final int ANTALL = 3;
        final double RABATTPROSENT = 19;

        PriskalkulatorStateless pk2 = new PriskalkulatorStateless();
        System.out.println(pk2.beregnTotalPrisMedRabatt(
                STYKKPRIS, ANTALL, RABATTPROSENT));

        // "Funksjonell"
        // Kan en PriskalkulatorStateful deles og brukes av flere tråder samtidig?
    }
}
