package Car.Parking.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ParkingPlace")
public class ParkingPlace {
	@Id
	@GeneratedValue
private int id;
private String city;
private String area;
private String location;
private String locationname;
private String floor;
private Long slots;


public String getLocationname() {
	return locationname;
}
public void setLocationname(String locationname) {
	this.locationname = locationname;
}
public Long getSlots() {
	return slots;
}
public void setSlots(Long slots) {
	this.slots = slots;
}
public String getFloor() {
	return floor;
}
public void setFloor(String floor) {
	this.floor = floor;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}

}
