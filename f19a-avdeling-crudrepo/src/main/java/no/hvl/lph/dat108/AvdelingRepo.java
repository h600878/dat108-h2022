package no.hvl.lph.dat108;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AvdelingRepo extends JpaRepository<Avdeling, Integer> {
	Avdeling findByNavn(String navn);
}
