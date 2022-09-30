package no.hvl.dat108.f12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiverseController {

    @ResponseBody
    @GetMapping(value = "/diverse", produces = "text/plain")
    public String visDiverseInfo() {
        String svar = "...";
        return svar;
    }

    @ResponseBody
    @GetMapping(value = "/settCookie", produces = "text/plain")
    public String locale() {
        String svar = "...";
        return svar;
    }


}