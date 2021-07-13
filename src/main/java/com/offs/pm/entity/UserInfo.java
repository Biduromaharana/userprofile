package com.offs.pm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "USER_TABLE")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "USER_CONTACT_NO")
	private String contactNumber;

	@Column(name = "USER_AGE")
	private Integer age;
	
	@Column(name = "USER_EMAIL_ID")
	private String emailId;
	
	
	public Date getUserCreateDateTime() {
		return userCreateDateTime;
	}

	public void setUserCreateDateTime(Date userCreateDateTime) {
		this.userCreateDateTime = userCreateDateTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name="USER_CREATE_DATE_TIME")
	private Date userCreateDateTime;
	
	@Column(name= "USEr_LAST_UPDATE_TIME")
	private Date lastUpdateTime;

	public UserInfo(Integer userId, String username, String contactNumber, Integer age,String emailId) {

		this.userId = userId;
		this.username = username;
		this.contactNumber = contactNumber;
		this.age = age;
		this.emailId = emailId;
	}

	public UserInfo() {

	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
