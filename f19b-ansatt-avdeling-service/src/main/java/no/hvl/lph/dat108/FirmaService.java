package no.hvl.lph.dat108;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service er en slags mellommann mellom controller og entiteter
 */
@Service
public class FirmaService {

    @Autowired
    private AvdelingRepo avdelingRepo;
    @Autowired
    private AnsattRepo ansattRepo;

    /**
     *
     * @return En liste over alle avdelinger
     */
    public List<Avdeling> finnAlleAvdelinger() {
        return avdelingRepo.findAll();
    }

    /**
     *
     * @param id Id-en til avdelingen
     * @return En avdeling ved gitt id, kaster unntak dersom en avdeling ikke er funnet
     */
    public Avdeling finnAvdelingMedId(int id) {
        return avdelingRepo.getById(id);
    }

    public Avdeling finnAvdelingMedNavn(String navn) {
        return avdelingRepo.findByNavn(navn);
    }

    public List<Ansatt> finnAlleAnsatte() {
        return ansattRepo.findAll();
    }

    public Ansatt finnAnsattMedId(int id) {
        return ansattRepo.getById(id);
    }

    public Ansatt finnAnsattMedNavn(String navn) {
        return ansattRepo.findByNavn(navn);
    }

    // --

    public int snittlonn(String avdNavn) {
        Avdeling avdeling = avdelingRepo.findByNavn(avdNavn);
        List<Ansatt> aiAvdeling = ansattRepo.findAllByAvdelingId(avdeling.getId());

        int sum = aiAvdeling.stream().mapToInt(Ansatt::getManedslonn).sum();
        int antall = aiAvdeling.size();

        return sum / antall;
    }

    public void erikFlytterTil(String avnNavn) {

        Ansatt erik = ansattRepo.findByNavn("Erik");
        Avdeling avd = avdelingRepo.findByNavn(avnNavn);

        if (erik != null && avd != null) {
            erik.setAvdeling(avd);
            ansattRepo.save(erik);
        }
    }
}
