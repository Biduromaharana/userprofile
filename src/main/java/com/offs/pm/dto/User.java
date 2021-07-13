package com.offs.pm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("user_name")
	private String name;

	@JsonProperty("user_phoneNo")
	private String phoneNo;

	@JsonProperty("user_emalId")
	private String emailId;

	@JsonProperty("user_age")
	private Integer age;

	public User() {
	}

	public User(String name, String phoneNo, String emailId, Integer age) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
