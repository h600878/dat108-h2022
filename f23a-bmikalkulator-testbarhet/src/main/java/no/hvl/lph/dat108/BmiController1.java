package no.hvl.lph.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiController1 {
	
	@GetMapping("/bmi1")
	public String bmi1(@RequestParam(required = false) String hoyde, 
			@RequestParam(required = false) String vekt, Model model) {
		
        String hoydeInput = hoyde;
        String vektInput = vekt;

        if (hoydeInput != null && vektInput != null) {

            try {
                double hoydeMeter = Double.parseDouble(hoydeInput) / 100;
                double vektKg = Double.parseDouble(vektInput);

                if (hoydeMeter >= 1 && hoydeMeter <= 2.5 
                        && vektKg >= 10 && vektKg <= 250) {
                    
                    double bmi = vektKg / (hoydeMeter * hoydeMeter);
                    model.addAttribute("bmi", Math.round(bmi*10)/10.0);
                    
                } else {
                	model.addAttribute("feilmelding", "Høyde og vekt må være normale verdier!");
                }
            } catch (NumberFormatException e) {
            	model.addAttribute("feilmelding", "Høyde og vekt må være tall!");
            }
        }

        return "bmi1";
	}
}
