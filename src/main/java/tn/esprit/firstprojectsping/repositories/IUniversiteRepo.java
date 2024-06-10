package tn.esprit.firstprojectsping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectsping.entities.Universite;

@Repository
public interface IUniversiteRepo extends JpaRepository<Universite,Integer> {
    Universite findByNomUniversite(String nomUniversite);
}
