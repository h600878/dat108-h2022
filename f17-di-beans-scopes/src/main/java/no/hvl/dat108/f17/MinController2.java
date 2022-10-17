package no.hvl.dat108.f17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinController2 {
	
	@GetMapping(value="/mapping2", produces="text/plain")
	@ResponseBody
	public String mapping2() {
		return "mapping2";
	}
	

}