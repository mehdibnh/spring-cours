package tn.esprit.firstprojectsping.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    private Foyer foyer;
    @ToString.Exclude
    @OneToMany
    @JsonIgnore
    private Set<Chambre> chambres;

}
