package no.hvl.lph.dat108;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    /**
     * Oppretter en ny databasehjelper
     */
    @Autowired
    private AvdelingRepo avdelingRepo;

    @ResponseBody
    @GetMapping(value = "/avdelinger", produces = "text/plain")
    public String avdelinger() {
        return listToString(avdelingRepo.findAll());
    }

    @ResponseBody
    @GetMapping(value = "/avdpaaid", produces = "text/plain")
    public String avdpaaid(@RequestParam int id) {
        return avdelingRepo.findById(id).toString(); // Optional<Avdeling> | Optional.empty
//    	return avdelingRepo.getById(id).toString();  // Avdeling | EntityNotFoundException
    }

    /**
     * Søker etter en avdeling med gitt navn
     * @param navn Navnet til avdelingen vi ønsker å finne
     * @return Navnet på avdelingen hvis den ble funnet, hvis ikke null
     */
    @ResponseBody
    @GetMapping(value = "/avdpaanavn", produces = "text/plain")
    public String avdpaanavn(@RequestParam String navn) {
        return avdelingRepo.findByNavn(navn).toString(); // Avdeling | null
    }

    /**
     * Oppretter en ny avdeling ved gitt navn, og legger den til i databasen
     * @param navn Navnet til avdelingen
     * @return Den nye avdelingens toString() metode
     */
    @ResponseBody
    @GetMapping(value = "/nyavd", produces = "text/plain")
    public String nyavd(@RequestParam String navn) {
        Avdeling ny = new Avdeling();
        ny.setNavn(navn);
        avdelingRepo.save(ny);
        return ny.toString();
    }

    // ------------------------------------------------------------------------

    private <T> String listToString(List<T> elementer) {
        return elementer.stream().map(T::toString).collect(Collectors.joining("\n"));
    }
}
