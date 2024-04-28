package tn.esprit.gestionreservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionreservation.Entity.Local;

public interface LocalRepository extends JpaRepository<Local, Long> {
}
