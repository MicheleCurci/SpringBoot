
package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {
	//@JsonProperty("id")
	private int id;
	//@JsonProperty("firstName")
	private String firstName;
	//@JsonProperty("lastName")
	private String lastName;
	//@JsonProperty("phone")
	private String phone;
	//@JsonProperty("email")
	private String email;

	@JsonCreator
	public Contact(@JsonProperty("id") int id, @JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
			@JsonProperty("phone") String phone, @JsonProperty("email") String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}
	


	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nome: " + firstName + "\nCognome: " + lastName + "\nTel.: " + phone + "\nE-mail: " + email + "\n";
	}

}
