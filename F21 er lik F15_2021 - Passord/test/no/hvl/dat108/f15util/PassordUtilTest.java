package no.hvl.dat108.f15util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PassordUtilTest {
	
	private static final String RIKTIG_PASSORD = "Abc de fgh";
	private static final String FEIL_PASSORD = "Java er kjedelig";
	
	private String salt;
	private String hash;
	
	@BeforeEach
	void setup() {
        salt = PassordUtil.genererTilfeldigSalt();
        hash = PassordUtil.hashMedSalt(RIKTIG_PASSORD, salt);
        System.out.println(hash);
	}

	@Test
	void riktigPassordVirker() {
        assertTrue(PassordUtil.validerMedSalt(RIKTIG_PASSORD, salt, hash));
	}

	@Test
	void feilPassordVirkerIkke() {
        assertFalse(PassordUtil.validerMedSalt(FEIL_PASSORD, salt, hash));
	}
	
	@Test
	void tomHashVirkerIkke() {
        assertFalse(PassordUtil.validerMedSalt(FEIL_PASSORD, salt, ""));
	}
	
	@Test
	void nullPassordKasterUnntak1() {
        assertThrows(IllegalArgumentException.class, 
        		() -> PassordUtil.hashMedSalt(null, salt));
	}
	
	@Test
	void nullPassordKasterUnntak2() {
        assertThrows(IllegalArgumentException.class, 
        		() -> PassordUtil.validerMedSalt(null, salt, hash));
	}
	
	@Test
	void nullHashKasterUnntak() {
        assertThrows(IllegalArgumentException.class, 
        		() -> PassordUtil.validerMedSalt(RIKTIG_PASSORD, salt, null));
	}
	
}
