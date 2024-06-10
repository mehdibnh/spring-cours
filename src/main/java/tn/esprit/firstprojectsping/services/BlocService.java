package tn.esprit.firstprojectsping.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.repositories.IBlocRepo;
import tn.esprit.firstprojectsping.repositories.IFoyerRepo;
import tn.esprit.firstprojectsping.services.interfaces.IBlocService;

@Service
@AllArgsConstructor
@Slf4j
public class BlocService implements IBlocService {

    IBlocRepo blocRepo;
    IFoyerRepo foyerRepo;

    @Override
    public Bloc affecterBlocAFoyer(Long blocId, Integer foyerId) {
        Bloc bloc = blocRepo.findById(blocId).get();
        Foyer foyer = foyerRepo.findById(foyerId).get();
        bloc.setFoyer(foyer);
        foyer.getBlocs().add(bloc);
        foyerRepo.save(foyer);
        return bloc;
    }

    @Override
    public Bloc desaffecterBlocAFoyer(long idFoyer) {
        Bloc bloc = blocRepo.findById(idFoyer).get();
        bloc.setFoyer(null);
        return blocRepo.save(bloc);
    }

    @Scheduled(fixedRate = 10000) //toutes les 60secondes
    void recette(){
        log.info("scheduler");
        for(Bloc bloc:blocRepo.findAll())
        {
            log.info("bloc :"+bloc.getIdBloc()+" est "+bloc.toString());
        }
    }
}
