package tn.esprit.firstprojectsping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstprojectsping.entities.Reservation;

@Repository
public interface IReservationRepo extends JpaRepository<Reservation,String> {
}
