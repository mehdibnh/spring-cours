package tn.esprit.firstprojectsping.services.interfaces;

import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.entities.Universite;

public interface IUniversiteService {
    Universite affecterFoyerAUniversite(Integer idFoyer, String nomUniversite);

}
