package tn.esprit.firstprojectsping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectsping.entities.Foyer;

@Repository
public interface IFoyerRepo extends JpaRepository<Foyer,Integer> {
    Foyer findFoyerByNomFoyer(String nom);
    Foyer findFoyerByIdFoyer(Integer id);


    @Query("select foyer from Foyer foyer join foyer.blocs bloc where foyer.nomFoyer=:nom and bloc.idBloc=:id")
    Foyer chercherFoyerParNomEtIDBloc(@Param("nom") String nomF,@Param("id") long idBloc);


}
