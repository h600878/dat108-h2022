package no.hvl.lph.dat108.f06;

public class Person {

    // Har fjernet private for å slippe å bruke gettere.
    String fornavn;
    String etternavn;
    int fodselsaar;

    public Person(String fornavn, String etternavn, int fodselsaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;
    }

    @Override
    public String toString() {
        return "[" + fornavn + " " + etternavn + ", f. " + fodselsaar + "]";
    }
}
