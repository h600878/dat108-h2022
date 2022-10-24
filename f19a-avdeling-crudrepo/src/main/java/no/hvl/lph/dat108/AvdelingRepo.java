package no.hvl.lph.dat108;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<> Inneholder mange nyttige operasjoner for JPA.
 * Blant annet save(T entitet) for å legge til og oppdatere, findById(ID id), findAll(), delete(ID id)...
 * De generiske typene <T, ID> reprensenterer hovedobjektet og datatypen til id nøkkelen
 */
public interface AvdelingRepo extends JpaRepository<Avdeling, Integer> {
    Avdeling findByNavn(String navn);
}
