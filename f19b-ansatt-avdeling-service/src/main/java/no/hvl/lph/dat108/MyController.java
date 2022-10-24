package no.hvl.lph.dat108;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    /**
     * Henter databasehjelper
     */
    @Autowired
    private FirmaService aService;

    /**
     *
     * @return Alle avdelinger
     */
    @ResponseBody
    @GetMapping(value = "/avdelinger")
    public List<Avdeling> avdelinger() {
        return aService.finnAlleAvdelinger();
    }

    /**
     *
     * @return En liste over alle ansatte
     */
    @ResponseBody
    @GetMapping(value = "/ansatte")
    public List<Ansatt> ansatte() {
        return aService.finnAlleAnsatte();
    }

    /**
     *
     * @return Snittlønnen på IT avdelingen
     */
    @ResponseBody
    @GetMapping(value = "/snittlonnIT", produces = "text/plain")
    public String snittlonn() {
        return "" + aService.snittlonn("IT");
    }

    @ResponseBody
    @GetMapping(value = "/erikFlytter", produces = "text/plain")
    public String erikFlytter(@RequestParam String tilAvdeling) {

        aService.erikFlytterTil(tilAvdeling);

        Ansatt erik = aService.finnAnsattMedNavn("Erik");
        if (erik != null) {
            return "" + erik;
        }
        return "NOE GIKK GALT!";
    }

}
