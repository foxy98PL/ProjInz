package pl.tomacie861.ProjInz.patientInfo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;



@Entity
@Table(name = "projinz.basicinformation")

public class PatientInfoModel {

@Id
private Long pesel;
	
@Column(name="firstname")
	private String firstname;
@Column(name="secondname")
	private String secondname;
@Column(name="surrname")
	private String surrname;
@Column(name="city")
	private String city;
@Column(name="street")
	private String street;
@Column(name="house_nbr")
	private String house_nbr;
public Long getPesel() {
	return pesel;
}
public void setPesel(Long pesel) {
	this.pesel = pesel;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
public String getSurrname() {
	return surrname;
}
public void setSurrname(String surrname) {
	this.surrname = surrname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getHouse_nbr() {
	return house_nbr;
}
public void setHouse_nbr(String house_nbr) {
	this.house_nbr = house_nbr;
}
public PatientInfoModel(Long pesel, String firstname, String secondname, String surrname, String city, String street,
		String house_nbr) {
	super();
	this.pesel = pesel;
	this.firstname = firstname;
	this.secondname = secondname;
	this.surrname = surrname;
	this.city = city;
	this.street = street;
	this.house_nbr = house_nbr;
}


public PatientInfoModel() {
	
}
@Override
public String toString() {
	return "Model [pesel=" + pesel + ", firstname=" + firstname + ", secondname=" + secondname + ", surrname="
			+ surrname + ", city=" + city + ", street=" + street + ", house_nbr=" + house_nbr + "]";
}


	
	

}
