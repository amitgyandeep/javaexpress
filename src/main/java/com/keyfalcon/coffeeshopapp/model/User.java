package com.keyfalcon.coffeeshopapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "tbl_user")
@XmlRootElement(name = "user")
public class User extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name = "userName")
	@Column(name = "userName")
	private String userName;
	
	@XmlAttribute(name = "emailId")
	@Column(name = "emailId")
	private String emailId;
	
	@XmlAttribute(name = "password")
	@Column(name = "password")
	private String password;
	
	@XmlAttribute(name = "phoneNumber")
	@Column(name = "phoneNumber")
	private String phoneNumber;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
