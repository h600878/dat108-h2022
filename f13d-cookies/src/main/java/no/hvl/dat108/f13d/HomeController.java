package no.hvl.dat108.f13d;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_HH:mm:ss");

    /**
     * Viser en enkel side med en melding første gang man er innom. Hvis man besøker innen 30 sekunder får man en annen melding.
     * @param sisteBesok En cookie som vi skal lete etter, ved navn "sisteBesok" og den er ikke nødvendig
     * @param model Model for .jsp
     * @param response Header
     * @return Et view til homeView
     */
    @GetMapping("/home")
    public String home(
            @CookieValue(name = "sisteBesok", required = false) String sisteBesok,
            Model model, HttpServletResponse response) {

        // Hvis den ikke eksisterer
        if (sisteBesok == null) { // evt. kan man bruke Optional
            model.addAttribute("melding", "Hei. Velkommen første gang til oss.");
        }
        // Hvis den allerede eksisterer
        else {
            model.addAttribute("melding", "Hei. Ser du var sist inne " + sisteBesok);
        }

        // Oppretter en ny cookie, hvor "sisteBesok" er navnet på cookien
        Cookie c = new Cookie("sisteBesok", LocalDateTime.now().format(formatter));
        c.setMaxAge(10); // Setter maks levetid på cookien i sekunder, en negativ verdi gir oss en session-cookie, 0 sletter
        response.addCookie(c); // Legger til cookie

        return "homeView";
    }

}