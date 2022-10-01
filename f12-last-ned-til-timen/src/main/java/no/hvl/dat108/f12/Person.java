package no.hvl.dat108.f12;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Person {

    @Size(min = 2, message = "Navn må innheolde minst 2 tegn") // Krav til minste lengden på strengen
    private String navn;

    @Pattern(regexp = "^\\d{8}$", message = "Telefonnummer må være nøyaktig 8 sifre") // Krav til kun tall (\d) og nøyaktig 8 siffer
    private String mobil;

    @Max(value = 250, message = "Du kan ikke være høyere enn 250 cm") // Krav til maks verdi
    @Min(value = 50, message = "Du kan ikke være lavere enn 50 cm")
    private int hoydecm;

//    @Past(message = "Du må være født i fortiden") // Dato må være i fortiden
    private String fdato; // FIXME virker ikke med LocalDate

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

    public String getFdato() {
        return fdato;
    }

    public void setFdato(String fdato) {
        this.fdato = fdato;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", mobil='" + mobil + '\'' +
                ", hoydecm=" + hoydecm +
                ", fdato=" + fdato +
                '}';
    }
}
