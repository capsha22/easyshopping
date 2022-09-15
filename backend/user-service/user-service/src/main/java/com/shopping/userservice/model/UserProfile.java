package com.shopping.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;
@Document(collection = "Users")
public class UserProfile {
	@Id
	private String id;
	@ApiModelProperty(notes = "The username of the user")
	private String userName;
	@ApiModelProperty(notes = "The password of the user")
	private String password;
	@ApiModelProperty(notes = "The email of the user")
	private String email;
	@ApiModelProperty(notes = "The mobile number of the user")
	private String mobileNo;
	@ApiModelProperty(notes = "The address of the user")
	private Address address;
	@ApiModelProperty(notes = "The role of the user")
	private String role;
	
	public UserProfile() {
		
	}
	
	
     public UserProfile(String id, String userName, String password, String email, String mobileNo, Address address,
			String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.role = role;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
     
     
	
	
	
	
	
	
	
	
	
	
	

	

}
