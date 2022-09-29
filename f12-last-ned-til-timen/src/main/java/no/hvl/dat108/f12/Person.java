package no.hvl.dat108.f12;

import java.time.LocalDate;

public class Person {
	
	private String navn;
	private String mobil;
	private int hoydecm;
	private LocalDate fdato;
	
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getMobil() {
		return mobil;
	}
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	public int getHoydecm() {
		return hoydecm;
	}
	public void setHoydecm(int hoydecm) {
		this.hoydecm = hoydecm;
	}
	public LocalDate getFdato() {
		return fdato;
	}
	public void setFdato(LocalDate fdato) {
		this.fdato = fdato;
	}
	
	
}
