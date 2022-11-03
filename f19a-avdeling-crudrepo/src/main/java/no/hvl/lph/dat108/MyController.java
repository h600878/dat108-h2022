package no.hvl.lph.dat108;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
    @Autowired private AvdelingRepo avdelingRepo;

    @GetMapping(value = "/avdelinger", produces = "text/plain")
    @ResponseBody
    public String avdelinger() {
    	return listToString(avdelingRepo.findAll());
    }

    @GetMapping(value = "/avdpaaid", produces = "text/plain")
    @ResponseBody
    public String avdpaaid(@RequestParam int id) {
//    	return avdelingRepo.findById(id).toString(); //Optional<Avdeling> | Optional.empty
    	return avdelingRepo.getById(id).toString();  //Avdeling | EntityNotFoundException
    }
    
    
    
    
    @GetMapping(value = "/avdpaanavn", produces = "text/plain")
    @ResponseBody
    public String avdpaanavn(@RequestParam String navn) {
    	return avdelingRepo.findByNavn(navn).toString(); //Avdeling | null
    }

    @GetMapping(value = "/nyavd", produces = "text/plain")
    @ResponseBody
    public String nyavd(@RequestParam String navn) {
    	Avdeling ny = new Avdeling();
    	ny.setNavn(navn);
    	avdelingRepo.save(ny);
    	return ny.toString();
    }
    
    // ------------------------------------------------------------------------
    
	private <T> String listToString(List<T> elementer) {
		String resultat = elementer.stream()
    			.map(T::toString)
    			.collect(Collectors.joining("\n"));
		return resultat;
	}
}
