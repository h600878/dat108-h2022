package no.hvl.dat108.webshop.controller;

import javax.servlet.http.HttpServletRequest;

import no.hvl.dat108.webshop.util.LoginUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/${app.url.login}")
public class LoginController {

    // Henter verdien til konstanten ved gitt navn i application.properties
    @Value("${app.message.invalidUsername}")
    private String INVALID_USERNAME_MESSAGE;

    /**
     * GET /login er forespørselen for å hente login-skjema.
     */
    @GetMapping
    public String hentLoginSkjema() {
        return "loginView";
    }

    /**
     * POST /login er forespørselen for å logge inn.
     */
    @PostMapping
    public String provAaLoggeInn(@RequestParam String username,
                                 HttpServletRequest request, RedirectAttributes ra) {

        if (username == null || username.length() < 3) {
            // Viser feilmelding helt til brukeren refresher siden
            ra.addFlashAttribute("redirectMessage", INVALID_USERNAME_MESSAGE);
            return "redirect:" + "login";
        }

        LoginUtil.loggInnBruker(request, username);

        return "redirect:" + "webshop";
    }
}
