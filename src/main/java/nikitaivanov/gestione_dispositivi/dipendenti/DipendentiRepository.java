package nikitaivanov.gestione_dispositivi.dipendenti;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DipendentiRepository extends JpaRepository<Dipendenti, Long> {
    Optional<Dipendenti> findByEmail(String email);
    Optional<Dipendenti> findByName(String name);
    Optional<Dipendenti> findById(long id);

    boolean existsByEmail(String email);
    boolean existsByName(String name);
    boolean existsById(long id);
}
