package com.inmemory.email.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class Email implements Serializable {

	private static final long serialVersionUID = 3016756487921605290L;

	// TODO: Add all fields/columns in the database to this class and
	// name them EXACTLY as they are in the database table

	String email;
	String firstName;
	String lastName;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	


}
