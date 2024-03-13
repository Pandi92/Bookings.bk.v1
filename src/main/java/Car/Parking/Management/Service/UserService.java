package Car.Parking.Management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Car.Parking.Management.Model.ParkingPlace;
import Car.Parking.Management.Model.User;
import Car.Parking.Management.Repo.ParkingRepo;
import Car.Parking.Management.Repo.UserRepo;
import ch.qos.logback.core.joran.spi.NoAutoStart;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;

	public User registerUser(User user) {
		if (userrepo.findByUsername(user.getUsername()) != null) {
			throw new RuntimeException("Username already exists");
		}
		return userrepo.save(user);
	}

	public User getUserByUsername(String username) {
		return userrepo.findByUsername(username);
	}

}
