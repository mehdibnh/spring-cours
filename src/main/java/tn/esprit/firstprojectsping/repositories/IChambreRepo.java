package tn.esprit.firstprojectsping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectsping.entities.Chambre;

@Repository
public interface IChambreRepo extends JpaRepository<Chambre,Long> {
}

