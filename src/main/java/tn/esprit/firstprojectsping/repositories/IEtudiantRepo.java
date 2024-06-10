package tn.esprit.firstprojectsping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectsping.entities.Etudiant;

@Repository
public interface IEtudiantRepo extends JpaRepository<Etudiant,Long> {
    Etudiant findByCIN(Long cin);
}
