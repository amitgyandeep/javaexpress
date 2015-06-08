package com.keyfalcon.coffeeshopapp.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "status")
public class Status implements Serializable{
	
	@XmlAttribute(name = "code")
	private int code;

	@XmlAttribute(name = "message")
	private String message;

	public Status() {

	}

	public Status( int code , String message ) {

		this.code = code;
		this.message = message;
	}

	public int getCode() {

		return code;
	}

	public void setCode( int code ) {

		this.code = code;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage( String message ) {

		this.message = message;
	}

}
