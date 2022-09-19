package no.hvl.dat108.f09;

import java.util.Set;

public class Utvikler {
	
	private String navn;
	private Set<String> spraak;
	
	public Utvikler(String navn, Set<String> spraak) {
		this.navn = navn;
		this.spraak = spraak;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Set<String> getSpraak() {
		return spraak;
	}

	public void setSpraak(Set<String> spraak) {
		this.spraak = spraak;
	}

	@Override
	public String toString() {
		return "Utvikler [navn=" + navn + ", spraak=" + spraak + "]";
	}
	
	

}
