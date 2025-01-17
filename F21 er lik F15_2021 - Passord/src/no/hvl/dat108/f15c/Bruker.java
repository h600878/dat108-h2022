package no.hvl.dat108.f15c;

import no.hvl.dat108.f15util.PassordUtil;

public class Bruker {

    private final String brukernavn;
    private final String salt;
    private final String passordhash;

    public Bruker(String brukernavn, String passord) {
        this.brukernavn = brukernavn;
        this.salt = PassordUtil.genererTilfeldigSalt();
        this.passordhash = PassordUtil.hashMedSalt(passord, salt);
    }

    public String getBrukernavn() {
        return brukernavn;
    }

    public String getSalt() {
        return salt;
    }

    public String getPassordhash() {
        return passordhash;
    }

    @Override
    public String toString() {
        return "Bruker [\n\tbrukernavn=" + brukernavn + ", \n\tsalt=" + salt + ", \n\tpassordhash=" + passordhash + "]";
    }


}
