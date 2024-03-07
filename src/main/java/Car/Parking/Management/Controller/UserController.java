package Car.Parking.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Car.Parking.Management.Model.User;
import Car.Parking.Management.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
		 if (userservice.getUserByUsername(user.getUsername()) != null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists");
	        }
       User userdata = userservice.registerUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(userdata);
    }
}
