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
private String floor;
private Long slotno;

public Long getSlotno() {
	return slotno;
}
public void setSlotno(Long slotno) {
	this.slotno = slotno;
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
