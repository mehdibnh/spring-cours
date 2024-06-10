package tn.esprit.firstprojectsping.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numChambre;
    public enum typeChambre {
        SINGLE, DOUBLE, TRIPLE
    }
    @Enumerated(EnumType.STRING)
     typeChambre typeC;
    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;

}


