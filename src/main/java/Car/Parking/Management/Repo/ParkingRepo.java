package Car.Parking.Management.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Car.Parking.Management.Model.ParkingPlace;

@Repository
public interface ParkingRepo extends JpaRepository<ParkingPlace, Integer> {
	@Query(value = "SELECT * FROM PARKING_PLACE  where slots>0", nativeQuery = true)
	List<ParkingPlace> findBySlot(Long slots);
	
	@Query(value="SELECT * FROM PARKING_PLACE  where city=:city",nativeQuery = true)
	List<ParkingPlace>findBycity(String city);
}
