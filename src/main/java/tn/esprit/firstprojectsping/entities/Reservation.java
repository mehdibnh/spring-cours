package tn.esprit.firstprojectsping.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estvalide;

    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;

    @ManyToOne
    private Chambre chambre;
}
