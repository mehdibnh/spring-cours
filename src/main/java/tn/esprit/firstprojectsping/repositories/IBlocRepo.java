package tn.esprit.firstprojectsping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectsping.entities.Bloc;

@Repository
public interface IBlocRepo extends JpaRepository<Bloc,Long> {

}
