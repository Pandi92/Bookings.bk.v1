//package Car.Parking.Management.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import Car.Parking.Management.Model.Car;
//import Car.Parking.Management.Repo.CarRepo;
//
//@RestController
//@RequestMapping
//public class CarController {
//	   @Autowired
//	    private CarRepo carrepo;
//	   
//	    @PostMapping("/add")
//	    public ResponseEntity<?> addPerson(@RequestBody Car car){
//	        Car car1 = carrepo.saveAndFlush(car1);
//	        return ResponseEntity.status(HttpStatus.OK).body(car1);
//	    }
//	    @GetMapping("/check")
//	    public ResponseEntity<?> RegisterId (@RequestParam String username, @RequestParam String password){
//	        List<Car> Carrepo = carrepo.findBy(username,password);
//	        return ResponseEntity.status(HttpStatus.OK).body(Carrepo);
//	    }
//
//}
