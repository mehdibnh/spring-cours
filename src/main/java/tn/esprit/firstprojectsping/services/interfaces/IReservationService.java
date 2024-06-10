package tn.esprit.firstprojectsping.services.interfaces;

import tn.esprit.firstprojectsping.entities.Reservation;

public interface IReservationService {
    Reservation ajouterReservation(long idBloc, long cinEtudiant);
}
