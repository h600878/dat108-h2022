package no.hvl.lph.dat108;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiController6 {
	
    private BmiCalculator5 bmiCalc = new BmiCalculator5();
	
	@GetMapping("/bmi5")
	public String bmi5(@RequestParam(required = false) String hoyde, 
			@RequestParam(required = false) String vekt, Model model) {

        if (hoyde != null && vekt != null) {

            try {
                double hoydeMeter = Double.parseDouble(hoyde) / 100;
                double vektKg = Double.parseDouble(vekt);

                if (bmiCalc.gyldigHoydeMeter(hoydeMeter) 
                        && bmiCalc.gyldigVektKg(vektKg)) {

                    double bmi = bmiCalc.beregnBmi(hoydeMeter, vektKg);
                    double avrundetBmi = bmiCalc.rundAvTilEnDesimal(bmi);
                    BmiVektklasse5 vektklasse = bmiCalc.beregnVektklasse(bmi);
                    
                    model.addAttribute("bmi", avrundetBmi);
                    model.addAttribute("vektklasse", vektklasse);

                } else {
                	model.addAttribute("feilmelding", "Høyde og vekt må være normale verdier!");
                }
            } catch (NumberFormatException e) {
            	model.addAttribute("feilmelding", "Høyde og vekt må være tall!");
            }
        }
        return "bmi5";
	}
}
