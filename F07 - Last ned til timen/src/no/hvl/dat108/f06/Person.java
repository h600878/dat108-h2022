package no.hvl.dat108.f06;

public class Person implements Comparable<Person> {

    // Har fjernet private for å slippe å bruke gettere. Latskap!
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

    @Override
    public int compareTo(Person other) {
        return this.etternavn.compareTo((other.etternavn));
    }
}






