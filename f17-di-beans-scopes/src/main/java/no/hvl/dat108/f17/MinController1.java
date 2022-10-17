package no.hvl.dat108.f17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinController1 {

    @Autowired // Lager et nytt "MyBean" objekt automatisk
    private MyBean myBean;

    @Value("${app.melding1}")
    private String melding;

    @ResponseBody
    @GetMapping(value = "/mapping1", produces = "text/plain")
    public String mapping1() {
        return myBean.toString();
    }

}
