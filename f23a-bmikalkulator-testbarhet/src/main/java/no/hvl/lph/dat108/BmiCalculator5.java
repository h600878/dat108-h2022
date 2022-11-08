package no.hvl.lph.dat108;

import static no.hvl.lph.dat108.BmiVektklasse5.HELSESKADELIG_OVERVEKT;
import static no.hvl.lph.dat108.BmiVektklasse5.NORMALVEKT;
import static no.hvl.lph.dat108.BmiVektklasse5.OVERVEKT;
import static no.hvl.lph.dat108.BmiVektklasse5.UNDERVEKT;

public class BmiCalculator5 {

    /**
     * BMI-grenser fra WHO: 
     * BMI under 18,5 regnes som undervekt
     * BMI mellom 18,5 og 24,9 regnes som normalvekt 
     * BMI over 25 er definert som overvekt 
     * BMI over 30 er definert som helseskadelig overvekt
     */
    BmiVektklasse5 beregnVektklasse(double bmi) {
        return bmi < 18.5 ? UNDERVEKT
                : bmi < 25 ? NORMALVEKT
                : bmi < 30 ? OVERVEKT
                : HELSESKADELIG_OVERVEKT;
    }

    double rundAvTilEnDesimal(double tall) {
        return Math.round(tall * 10) / 10.0;
    }

    double beregnBmi(double hoydeMeter, double vektKg) {
        return vektKg / (hoydeMeter * hoydeMeter);
    }

    boolean gyldigHoydeMeter(double hoydeMeter) {
        return hoydeMeter >= 1 && hoydeMeter <= 2.5;
    }

    boolean gyldigVektKg(double vektKg) {
        return vektKg >= 10 && vektKg <= 250;
    }

}
