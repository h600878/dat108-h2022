package no.hvl.dat108.f11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistreringController {

    // Value må være samme som action i post
    @GetMapping(value = "/registrer")
    public String mottaRegistrering(
            Model model,
            // name = ... skal være samme som name i input i skjema
            @RequestParam(name = "fornavn") String fornavn,
            @RequestParam(name = "etternavn") String etternavn,
            @RequestParam(name = "aar") int aar
    ) {

        Person person = new Person(fornavn, etternavn, aar);

        model.addAttribute("p", person);
        return "kvittering";
    }

}
