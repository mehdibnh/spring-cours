package tn.esprit.firstprojectsping.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Chambre;
import tn.esprit.firstprojectsping.entities.Etudiant;
import tn.esprit.firstprojectsping.entities.Reservation;
import tn.esprit.firstprojectsping.repositories.IBlocRepo;
import tn.esprit.firstprojectsping.repositories.IChambreRepo;
import tn.esprit.firstprojectsping.repositories.IEtudiantRepo;
import tn.esprit.firstprojectsping.repositories.IReservationRepo;
import tn.esprit.firstprojectsping.services.interfaces.IReservationService;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Slf4j
@Service
public class ReservationService implements IReservationService {
    IBlocRepo blocRepo;
    IChambreRepo chambreRepo;
    IEtudiantRepo etudiantRepo;
    IReservationRepo reservationRepo;
    @Override
    public Reservation ajouterReservation(long idBloc, long cinEtudiant) {
        Bloc bloc = blocRepo.findById(idBloc).orElseThrow(() -> new RuntimeException("Bloc not found"));
        Etudiant etudiant = etudiantRepo.findByCIN(cinEtudiant);

        Set<Etudiant> etudiants = new HashSet<>();
        if (etudiant == null) {
            throw new RuntimeException("Etudiant not found");
        }
        else {
            etudiants.add(etudiant);
        }
        System.out.println(bloc.getChambres());
        Chambre chambreDisponible = bloc.getChambres().stream()
                .filter(chambre -> chambre.getReservations().size() < getMaxCapacity(chambre.getTypeC()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No available room"));

        String numReservation = generateNumReservation(chambreDisponible, bloc, new Date());
        Reservation reservation = new Reservation();
        reservation.setIdReservation(numReservation);
        reservation.setAnneeUniversitaire(new Date());
        reservation.setEstvalide(true);
        reservation.setChambre(chambreDisponible);
        reservation.setEtudiants(etudiants);

        return reservationRepo.save(reservation);

    }

    private int getMaxCapacity(Chambre.typeChambre typeC) {
        switch (typeC) {
            case SINGLE: return 1;
            case DOUBLE: return 2;
            case TRIPLE: return 3;
            default: throw new IllegalArgumentException("Unknown room type");
        }
    }

    private String generateNumReservation(Chambre chambre, Bloc bloc, Date anneeUniversitaire) {
        String year = String.valueOf(anneeUniversitaire.getYear() + 1900);
        return chambre.getNumChambre() + "-" + bloc.getNomBloc() + "-" + year;
    }

}
