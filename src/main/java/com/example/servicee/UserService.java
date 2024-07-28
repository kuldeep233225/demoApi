package com.example.servicee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.reposetryy.Reposetryy;

@Service
public class UserService {
	
	@Autowired
	private Reposetryy repoo;
	
	//post
	public UserEntity saveData(UserEntity use)
	{
		UserEntity sav = repoo.save(use);
		return sav;
	}
	
	//get
	public UserEntity getData(Long IdName)
	{
		return repoo.findById(IdName).get();
	}
	
	//update
	public UserEntity uodatee(UserEntity userr, Long IdName)
	{
		UserEntity byId = repoo.findById(IdName).get();
		byId.setName(userr.getName());
		byId.setCity(userr.getCity());
		byId.setPin(userr.getPin());
		byId.setMobile(userr.getMobile());
		byId.setAadhar(userr.getAadhar());
		
		return repoo.save(byId);
	}
	//delete
	public String deleteData(Long IdName)
	{
		UserEntity byId = repoo.findById(IdName).get();
				repoo.delete(byId);
				return "Data deleted";	
	}

}
