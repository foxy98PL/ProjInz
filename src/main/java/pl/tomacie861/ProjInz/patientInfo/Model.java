package pl.tomacie861.ProjInz.patientInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projinz.basicinformation")
public class Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pesel;
	
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "secondname")
	private String secondname;
	@Column(name = "surrname")
	private String surrname;
	@Column(name = "city")
	private String city;
	@Column(name = "street")
	private String street;
	@Column(name = "house_nbr")
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
	
	public Model() {
		
	}
	public Model(Long pesel, String firstname, String secondname, String surrname, String city, String street,
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((house_nbr == null) ? 0 : house_nbr.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
		result = prime * result + ((secondname == null) ? 0 : secondname.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((surrname == null) ? 0 : surrname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (house_nbr == null) {
			if (other.house_nbr != null)
				return false;
		} else if (!house_nbr.equals(other.house_nbr))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		if (secondname == null) {
			if (other.secondname != null)
				return false;
		} else if (!secondname.equals(other.secondname))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (surrname == null) {
			if (other.surrname != null)
				return false;
		} else if (!surrname.equals(other.surrname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Model [pesel=" + pesel + ", firstname=" + firstname + ", secondname=" + secondname + ", surrname="
				+ surrname + ", city=" + city + ", street=" + street + ", house_nbr=" + house_nbr + "]";
	}
	
	
	

}
