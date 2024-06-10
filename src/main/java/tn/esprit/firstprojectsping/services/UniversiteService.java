package tn.esprit.firstprojectsping.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.entities.Universite;
import tn.esprit.firstprojectsping.repositories.IFoyerRepo;
import tn.esprit.firstprojectsping.repositories.IUniversiteRepo;
import tn.esprit.firstprojectsping.services.interfaces.IUniversiteService;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UniversiteService implements IUniversiteService {
    IFoyerRepo foyerRepo;
    IUniversiteRepo universiteRepo;
    @Override
    public Universite affecterFoyerAUniversite(Integer idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepo.findFoyerByIdFoyer(idFoyer);
        Universite universite = universiteRepo.findByNomUniversite(nomUniversite);
        if(foyer != null && universite != null){
            foyer.setUniversite(universite);
            universite.setFoyer(foyer);
            return universiteRepo.save(universite);
        }
        return null;
    }
}
