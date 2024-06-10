package tn.esprit.firstprojectsping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  idUniversite;
    private String nomUniversite;
    private String adrxesse;

    @OneToOne
    private Foyer foyer;
}
