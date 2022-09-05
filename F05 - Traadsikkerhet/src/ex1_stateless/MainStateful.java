package ex1_stateless;

public class MainStateful {

    public static void main(String[] args) {

        //Eksemplet gir 240,57 kr som avrundes til 241 kr.
        final int STYKKPRIS = 99;
        final int ANTALL = 3;
        final double RABATTPROSENT = 19;

        PriskalkulatorStateful pk1 = new PriskalkulatorStateful();
        pk1.setStykkpris(STYKKPRIS);
        pk1.setAntall(ANTALL);
        pk1.setRabattprosent(RABATTPROSENT);
        System.out.println(pk1.beregnTotalPrisMedRabatt());

        // "Objektorientert"
        // Kan en PriskalkulatorStateful deles og brukes av flere tråder samtidig?
    }
}
