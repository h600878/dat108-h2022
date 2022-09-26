package no.hvl.dat108.f11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistreringController {
	
	@GetMapping(value = "/???")
	public String mottaRegistrering(Model model, 
			@RequestParam(name = "???") String fornavn, 
			@RequestParam(name = "???") String etternavn,
			@RequestParam(name = "???") int aar) {
		
		Person person = new Person(fornavn, etternavn, aar);
		
		model.addAttribute("p", person);
		return "kvittering";
	}
	
	
}
