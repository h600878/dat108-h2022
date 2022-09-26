/*
 * En helt plain Java-klasse (-Bean)
 * Brukes for å demonstrere objekt -> JSON.
 */
package no.hvl.dat108.f10;

public class Hilsen {

	String person;
	String tekst = "Hei på deg, ";
	
	public Hilsen(String person) {
		this.person = person;
	}

	public String getPerson() {
		return person;
	}

	public String getTekst() {
		return tekst;
	}
	
	
}
