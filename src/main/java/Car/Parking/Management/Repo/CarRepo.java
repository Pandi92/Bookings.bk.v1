//package Car.Parking.Management.Repo;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import Car.Parking.Management.Model.Car;
//
//
//@Repository
//public interface CarRepo extends JpaRepository<Car, Integer> {
//	  
//    @Query(value = "SELECT * FROM REGISTER WHERE  username = :username AND password = :password", nativeQuery = true)
//    List<Car>findBy(String username, String password);
//
//
//}
