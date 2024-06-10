package tn.esprit.firstprojectsping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUser;
    @Column (length = 8, name = "identifiant")
    String cin;
    @Transient
    String firstName;
    String lastName;
    LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    Role role;

}
