/*
 * Dette er et eksempel på en Spring MVC Controller.
 * 
 * En controller sin rolle i en web-applikasjon er å ta imot
 * requests (forespørsler) fra web-klienter (f.eks. weblesere).
 * 
 * I eksemplet så vi på hvordan vi får tak i request-parameteren "person",
 * og hvordan vi kan gi svar via 3 ulike responstyper (text/plain, 
 * application/json og text/html).
 * 
 * Vanligvis vil en web-applikasjon ha mange controllere ...
 */
package no.hvl.dat108.f11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimtallController {
	
	@GetMapping(value = "/prime")
	public String mottaRegistrering(Model model /*, ???*/) {
		
		//Sjekk om tallet er gyldig? Hva om bruker skriver "X"

		//Sjekk om det er et primtall
		
		//Gjøre data tilgjengelig for kvittering-view
		
		return "kvittering";
	}
}
