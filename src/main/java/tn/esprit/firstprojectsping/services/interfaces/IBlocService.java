package tn.esprit.firstprojectsping.services.interfaces;

import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;

public interface IBlocService {
    Bloc affecterBlocAFoyer(Long blocId, Integer foyerId);
    Bloc desaffecterBlocAFoyer(long idBloc);
}
