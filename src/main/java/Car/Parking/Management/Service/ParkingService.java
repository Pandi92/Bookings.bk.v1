package Car.Parking.Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Car.Parking.Management.Model.ParkingPlace;
import Car.Parking.Management.Repo.ParkingRepo;

@Service
public class ParkingService {
	@Autowired
	private ParkingRepo parkingrepo;

	public ParkingPlace addparking(ParkingPlace p) {
		return parkingrepo.saveAndFlush(p);
	}

	public List<ParkingPlace> alldata() {
		return parkingrepo.findAll();
	}

}
