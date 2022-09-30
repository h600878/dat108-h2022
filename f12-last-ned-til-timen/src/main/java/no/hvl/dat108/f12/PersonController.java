package no.hvl.dat108.f12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PersonController {

    @GetMapping("/personskjema")
    public String personskjema(Model model) {
        model.addAttribute("person", new Person());
        return "personSkjemaView";
    }

    /**
     * @param person Bruker en model Attributt fra skjemaet i .jsp filen, @Valid sjekker om personen oppfyller kravene i klassen
     * @return Viewet personKvitteringView.jsp med informasjon om personen som ble registrert
     */
    @PostMapping("/lagrePerson") // FIXME @Valid virker ikke
    public String lagrePerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult) {
        System.err.println(person);
        System.err.println("Lagrer i database...");

        if (bindingResult.hasErrors()) {
            return "personSkjemaView";
        }
        return "personKvitteringView";
    }

    @GetMapping("/registreringok")
    public String registreringok() {
        return "personKvitteringView";
    }

}