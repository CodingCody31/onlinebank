package com.meritamerica.onlinebank.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long address_id;
	private String country;
	private String state;
	private String city;
	private String street;
	private Integer zip_code;
	
    @OneToOne(mappedBy="address", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private User user;


	Address() {

	}

	public Address(String country, String state, String city, String street, Integer zip_code) {

		this.country = country;
		this.state = state;
		this.city = city;
		this.street = street;
		this.zip_code = zip_code;
	}

	public Long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public Integer getZip_code() {
		return zip_code;
	}

	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}

}
