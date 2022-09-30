package no.hvl.dat108.f12;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
	
	@Size(min=2, message="Navn må inneholde minst 2 tegn")
	private String navn;
	
	@Pattern(regexp = "^\\d{8}$", message="Mobilnummer må være eksakt 8 sifre")
	private String mobil;
	
	@Min(100)
	@Max(220)
	private int hoydecm;
	
	@Past
	private LocalDate fdato;
	
	@Override
	public String toString() {
		return "Person [navn=" + navn + ", mobil=" + mobil + ", hoydecm=" + hoydecm + ", fdato=" + fdato + "]";
	}
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
