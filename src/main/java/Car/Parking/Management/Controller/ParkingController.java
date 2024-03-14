package Car.Parking.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Car.Parking.Management.Model.ParkingPlace;
import Car.Parking.Management.Service.ParkingService;

@RestController
@RequestMapping("/addParking")
@CrossOrigin(origins = "http://localhost:3000")

public class ParkingController {
	@Autowired
	private ParkingService ps;

	@PostMapping("add_data")
	public ParkingPlace addParking(@RequestBody ParkingPlace pp) {
		return ps.addparking(pp);
	}

	@GetMapping("/get_data")
	public List<ParkingPlace> getalldata() {
		return ps.alldata();

	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteParking(@PathVariable int id) {
		String pp = ps.deleteParking(id);
		return ResponseEntity.status(HttpStatus.OK).body(pp);
	}

	@GetMapping("/Available")
	public ResponseEntity<List<ParkingPlace>> Availableslot(Long slots) {
		List<ParkingPlace> pp = ps.Availableslot(slots);
		return ResponseEntity.status(HttpStatus.OK).body(pp);
	}

	@GetMapping("city/{city}")
	public List<ParkingPlace> searchcity(@PathVariable String city) {
		List<ParkingPlace> pp = ps.searchcity(city);
		return (pp);
	}
}
