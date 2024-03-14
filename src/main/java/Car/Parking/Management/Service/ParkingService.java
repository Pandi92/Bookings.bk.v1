package Car.Parking.Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Car.Parking.Management.Model.ParkingPlace;
import Car.Parking.Management.Repo.ParkingRepo;

@Service
public class ParkingService {
	@Autowired
	private ParkingRepo parkingrepo;

	public ParkingPlace addparking(ParkingPlace p) {
		return parkingrepo.save(p);
	}

	public List<ParkingPlace> alldata() {
		return parkingrepo.findAll();
	}

	public String deleteParking(int id) {

		parkingrepo.deleteById(id);
		return ("data deleted");
	}
	
	public List<ParkingPlace> Availableslot(Long slots) {
		return parkingrepo.findBySlot(slots);
	}

	public List<ParkingPlace> searchcity(String city) {
		// TODO Auto-generated method stub
		return parkingrepo.findBycity(city);
	}
}
