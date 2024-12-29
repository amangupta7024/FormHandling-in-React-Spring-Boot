package com.formhandling.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserData {
	
	private String firstName;
	private String lastName;
	
	@Id
	private String email;
	
	private String contactNumber;
	private String address;
	private String city;
	private String state;
	private String country;
	
	//Parameterized constructor
	public UserData(String firstName, String lastName, String email, String contactNumber, String address, String city,
			String state, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	//Non parameterized constructor
	public UserData() {
		
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
