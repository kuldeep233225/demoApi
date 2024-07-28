package com.example.controllerr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.servicee.UserService;

@RestController
@RequestMapping("kuldeep")
public class UserController {

	@Autowired
	private UserService sarvis;
	
	@PostMapping("/post")
	public UserEntity saveData(@RequestBody UserEntity user)
	{
		UserEntity saveData = sarvis.saveData(user);
		return saveData;
	}
	@GetMapping("/get/{IdName}")
	public UserEntity getData(@PathVariable Long IdName)
	{
		return sarvis.getData(IdName);
	}
	@PutMapping("update/{IdName}")
	public UserEntity updateDataa(@RequestBody UserEntity usee,@PathVariable("IdName") Long IdName)
	{
		return sarvis.uodatee(usee, IdName);
	}
	@DeleteMapping("/delete/{IdName}")
	public String deleteData(@PathVariable Long IdName)
	{
		return sarvis.deleteData(IdName);
				
	}
}
