package Car.Parking.Management.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Car.Parking.Management.Model.ParkingPlace;

@Repository
public interface ParkingRepo extends JpaRepository<ParkingPlace, Integer> {
	
}
