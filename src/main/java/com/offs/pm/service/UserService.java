package com.offs.pm.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offs.pm.dto.User;
import com.offs.pm.entity.UserInfo;
import com.offs.pm.repo.UserRepositroy;

@Service
public class UserService {

	@Autowired
	UserRepositroy userRepo;

	public Integer create(User userdetails) {

		// Create the user entity

		UserInfo userInfo = new UserInfo();

		userInfo.setAge(userdetails.getAge());

		userInfo.setUsername(userdetails.getName());

		userInfo.setEmailId(userdetails.getEmailId());

		userInfo.setContactNumber(userdetails.getPhoneNo());

		userInfo.setUsername(userdetails.getName());

		userInfo.setUserCreateDateTime(Calendar.getInstance().getTime());

		userInfo.setLastUpdateTime(Calendar.getInstance().getTime());

		
		
		UserInfo saveInfo = userRepo.save(userInfo);
		
		return saveInfo.getUserId();

	}

	public User findById(String userId) {
		// TODO Auto-generated method stub

		UserInfo userDetails = userRepo.findById(new Integer(userId)).orElse(new UserInfo());

		User userdetailsInfo = new User();
		userdetailsInfo.setAge(userDetails.getAge());

		userdetailsInfo.setName(userDetails.getUsername());

		userdetailsInfo.setEmailId(userDetails.getEmailId());

		userdetailsInfo.setPhoneNo(userDetails.getContactNumber());

		return userdetailsInfo;

	}

}
