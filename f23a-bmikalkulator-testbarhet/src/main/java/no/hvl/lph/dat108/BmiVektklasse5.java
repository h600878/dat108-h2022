package no.hvl.lph.dat108;

public enum BmiVektklasse5 {
    UNDERVEKT, NORMALVEKT, OVERVEKT, HELSESKADELIG_OVERVEKT;

    @Override 
    public String toString() {
        return name().toLowerCase();
      }
}
