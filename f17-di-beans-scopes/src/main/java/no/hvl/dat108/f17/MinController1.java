package no.hvl.dat108.f17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinController1 {
	
	@GetMapping(value="/mapping1", produces="text/plain")
	@ResponseBody
	public String mapping1() {
		return "mapping1";
	}
	

}