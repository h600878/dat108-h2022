package no.hvl.lph.dat108;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
public class PersonServiceTest {
	
	@InjectMocks
	PersonService ps;
	
	@Mock
	PersonRepo pr;
	
	@Test
	void finnerDeSomErFodtIAar2000() {
		
		//Arrange
		when(pr.findAll()).thenReturn(List.of(
				new Person("Arne", 2000),
				new Person("Knut", 1999),
				new Person("Tore", 2000),
				new Person("Lars", 2001),
				new Person("Finn", 2002)));
		
		//Act
		List<String> resultat = ps.navnPaaAlleFodtIAar2000();
		
		//Assert
		assertEquals(2, resultat.size());
		assertTrue(resultat.contains("Arne"));
		assertTrue(resultat.contains("Tore"));
	}
}
