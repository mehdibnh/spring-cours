package tn.esprit.firstprojectsping.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstprojectsping.entities.Reservation;
import tn.esprit.firstprojectsping.services.interfaces.IReservationService;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class reservationRestController {
    IReservationService reservationService;
    @PostMapping("/bloc/{idBloc}/etudiant/{cinEtudiant}")
    public Reservation ajouterReservation(@PathVariable long idBloc, @PathVariable long cinEtudiant) {
        return reservationService.ajouterReservation(idBloc, cinEtudiant);
    }
}
