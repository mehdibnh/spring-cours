package tn.esprit.firstprojectsping.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.repositories.IBlocRepo;
import tn.esprit.firstprojectsping.repositories.IFoyerRepo;
import tn.esprit.firstprojectsping.services.interfaces.IFoyerService;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Slf4j
@Service
public class FoyerService implements IFoyerService {
    IFoyerRepo foyerRepo;
    IBlocRepo blocRepo;

    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        log.info(foyer.toString());
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer supprimerFoyer(Foyer foyer) {
        foyerRepo.delete(foyer);
        return foyerRepo.findById(foyer.getIdFoyer()).orElse(null);
    }

    @Override
    public Foyer récupérerFoyer(Integer idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public Foyer modifierFoyer(Integer idFoyer, Foyer foyer) {
        if (foyerRepo.existsById(idFoyer)) {
            foyer.setIdFoyer(idFoyer);
            return foyerRepo.save(foyer);
        } else {
            throw new RuntimeException("Foyer non trouvé, impossible de le modifier.");
        }
    }

    @Override
    public Foyer affecterFoyerABloc(String nomFoyer, Bloc bloc) {
        Foyer foyer = foyerRepo.findFoyerByNomFoyer(nomFoyer);
        bloc.setFoyer(foyer);
        blocRepo.save(bloc);
        return foyerRepo.findFoyerByNomFoyer(nomFoyer);
    }

    @Override
    public List<Foyer> récupérerListeFoyers() {
        return foyerRepo.findAll();
    }

}
