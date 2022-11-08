package no.hvl.lph.dat108;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonValideringTest {

	private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	
	@Test
	public void gyldigNavnOgFAar() {
		Person person = new Person("Per", 1970);
		assertTrue(harGyldig("navn", person));
		assertTrue(harGyldig("fodelsaar", person));
	}

	@ParameterizedTest
	@ValueSource(strings = {"", "A", "Hans Hansen"})
	public void ugyldigeNavn(String navn) {
		Person person = new Person(navn, 1970);
		assertFalse(harGyldig("navn", person));
	}
	
	/***********************************************************************/
	
	private boolean harGyldig(String feltnavn, Person person) {
		List<String> ugyldigeFelt = validator.validate(person).stream()
				.map(v -> v.getPropertyPath().toString())
				.toList();
		
		return !ugyldigeFelt.contains(feltnavn);
	}

}



