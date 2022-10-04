package no.hvl.dat108.f13b;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BestillingController {

//	@PostMapping("/bestilling")
//	public String bestillUtenPrg(@RequestParam String vare, Model model) {
//		System.err.println("Uten PRG: Det blir nå bestilt en " + vare);
//
//		model.addAttribute("vare", vare);
//		return "kvitteringView";
//	}

    @PostMapping("/bestilling")
    public String bestillMedPrg(@RequestParam String vare, RedirectAttributes ra, HttpSession session, Model model) {
        System.err.println("Med PRG:  Det blir nå bestilt en " + vare);

        // https://www.baeldung.com/spring-web-flash-attributes
        // Alt. 0b - Virker ikke i dette tilfellet, da det kun eksisterer i denne metoden
        model.addAttribute("MAvare", vare);
        // Alt. 1 - Lagerer dataene i denne sesjonen
        // Kan lagre dataene for lenge, hvis brukeren er på nettsiden lenge
        session.setAttribute("SAvare", vare);
        // Alt. 2 - Gjør om varen til et parameter i de neste requestene
        ra.addAttribute("RAvare", vare);
        // Alt. 3 - Samme som over, men funker kun for neste redirect
        ra.addFlashAttribute("RFAvare", vare);

        // Videresender til /kvittering
        return "redirect:kvittering";
    }

    /**
     * Lager en GET-request med parameter "String vare"
     * @param ra
     * @param request
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/kvittering")
    public String kvittering(RedirectAttributes ra, HttpServletRequest request, HttpSession session, Model model) {

        System.err.println("MAvare  : " + model.getAttribute("MAvare")); // null
        System.err.println("SAvare  : " + session.getAttribute("SAvare")); // vare
        System.err.println("RAvare  : " + ra.getAttribute("RAvare")); // vare
//        System.err.println("RFAvare : " + RequestContextUtils.getInputFlashMap(request).get("RFAvare"));

        return "kvitteringView";
    }
}