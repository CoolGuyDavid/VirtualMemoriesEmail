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
public class UserToCheck implements Serializable {

	private static final long serialVersionUID = 3016756487921605290L;

	// TODO: Add all fields/columns in the database to this class and
	// name them EXACTLY as they are in the database table

	int userID;

	String password;
	String email;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return userID;
	}

	public void setId(int userId) {
		this.userID = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
