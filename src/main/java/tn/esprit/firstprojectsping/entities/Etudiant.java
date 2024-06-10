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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomE;
    private String prenomE;
    private Long CIN;
    private String ecole;
    private Date dateNaissance;
    @ManyToMany
    private Set<Reservation> reservations;
}
