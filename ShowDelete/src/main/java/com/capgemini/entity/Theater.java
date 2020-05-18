package com.capgemini.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Theater {

	@Id
	@NotNull(message = "theaterid cannot be null")
	private int theaterid;

	@NotNull(message = "theater name cannot be null")
	private String thname;

	@NotNull(message = "city cannot be null")
	private String city;

	@NotNull(message = "manname cannot be null")
	private String manname;

	@NotNull(message = "manager contact cannot be null")
	private String manContact;

	@OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)

	private List<Screen> lscreens = new ArrayList<>();

	@OneToMany
	private List<Movie> lmovies = new ArrayList<>();

	@Override
	public String toString() {
		return "Theater [theaterid=" + theaterid + ", thname=" + thname + ", city=" + city + ", manname=" + manname
				+ ", manContact=" + manContact + "]";
	}

	public List<Screen> getLscreens() {
		return lscreens;
	}

	public void setLscreens(List<Screen> lscreens) {
		this.lscreens = lscreens;
	}

	public int getTheaterid() {
		return theaterid;
	}

	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
	}

	public String getThname() {
		return thname;
	}

	public void setThname(String thname) {
		this.thname = thname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getManname() {
		return manname;
	}

	public void setManname(String manname) {
		this.manname = manname;
	}

	public String getManContact() {
		return manContact;
	}

	public void setManContact(String manContact) {
		this.manContact = manContact;
	}

}
