package no.hvl.dat108.f12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiverseController {
	
    @GetMapping(value = "/diverse", produces="text/plain")
    @ResponseBody
    public String visDiverseInfo() {
    	String svar = "...";
        return svar;
    }
    
    @GetMapping(value = "/settCookie", produces="text/plain")
    @ResponseBody
    public String locale() {
    	String svar = "...";
        return svar;
    }

   
}