package com.yourube.demo.mode;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User extends ParentEntity {


	private static final long serialVersionUID = -2836006898149348943L;
	
	@Column(name="first_name",nullable=false,length=255)
	private String first_name;
	
	@Column(name="second_name",nullable=true,length=255)
	private String second_name;
	
	@Column(name="first_surname",nullable=false,length=255)
	private String first_surname;
	
	@Column(name="second_surname",nullable=true,length=255)
	private String second_surname;
	
	@Column(name="phone",nullable=true,length=255)
	private String phone;
	
	@Column(name="address",nullable=false,length=255)
	private String address;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getSecond_name() {
		return second_name;
	}
	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	public String getFirst_surname() {
		return first_surname;
	}
	public void setFirst_surname(String first_surname) {
		this.first_surname = first_surname;
	}
	public String getSecond_surname() {
		return second_surname;
	}
	public void setSecond_surname(String second_surname) {
		this.second_surname = second_surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
