package tn.esprit.firstprojectsping.services.interfaces;

import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;

import java.util.List;
import java.util.Set;

public interface IFoyerService {
    Foyer ajouterFoyer(Foyer foyer);
    Foyer supprimerFoyer(Foyer foyer);
    Foyer récupérerFoyer(Integer idFoyer);
    List<Foyer> récupérerListeFoyers();

    Foyer modifierFoyer(Integer idFoyer, Foyer foyer);
    Foyer affecterFoyerABloc(String nomFoyer, Bloc bloc);

}
