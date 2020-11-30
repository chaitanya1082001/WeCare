package com.example.wecare.sevice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.wecare.repository.UserRepository;
import com.example.wecare.dto.UserDto;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	//Contacts repository layer to add customer
	public String createUser(UserDto userDTO)
	{
		 var ch= userRepository.save(userDTO);
		 return "saved successfully";
	}
	public UserDto LoginWithEmailPassword(String email, String password)
	{
		return userRepository.FindByEmailPassword(email,password);
		  
	}
	public UserDto getById(String id )
	{
		return userRepository.FindById(id);
		  
	}
	public List<UserDto> getAllUsers( )
	{
		return userRepository.findAll();
		  
	}
}
