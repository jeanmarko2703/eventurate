package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Reservation;

@Repository
public interface ReservationRepository  extends JpaRepository<Reservation, Integer>{

}
