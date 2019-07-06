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
public class EmailList implements Serializable {

	private static final long serialVersionUID = 3016756487921605290L;

	// TODO: Add all fields/columns in the database to this class and
	// name them EXACTLY as they are in the database table

	String email;
	String firstName;
	String lastName;
	String email2;
	String firstName2;
	String lastName2;
	String email3;
	String firstName3;
	String lastName3;
	
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
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getFirstName2() {
		return firstName2;
	}
	public void setFirstName2(String firstName2) {
		this.firstName2 = firstName2;
	}
	public String getLastName2() {
		return lastName2;
	}
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	public String getEmail3() {
		return email3;
	}
	public void setEmail3(String email3) {
		this.email3 = email3;
	}
	public String getFirstName3() {
		return firstName3;
	}
	public void setFirstName3(String firstName3) {
		this.firstName3 = firstName3;
	}
	public String getLastName3() {
		return lastName3;
	}
	public void setLastName3(String lastName3) {
		this.lastName3 = lastName3;
	}
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	


}
