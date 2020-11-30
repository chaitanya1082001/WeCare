package com.example.wecare.Controller;

import java.util.stream.Collectors;

import javax.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.wecare.dto.UserDto;
import com.example.wecare.repository.UserRepository;
import com.example.wecare.sevice.UserService;
import com.example.wecare.dto.ErrorMessage;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/customers")
public class UserController  {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/post1")
	public List<UserDto> createCustomeryyy(@Valid @RequestBody UserDto userdto) 
	{
		
		userRepository.save(userdto);
		return userRepository.findAll();
	}
	
	
	@PostMapping("/loginUser")
	public UserDto createCustomer( @RequestBody UserDto userdto) throws Exception
	{ String tempUser=userdto.getName();
	String tempPass=userdto.getPassword();
	UserDto userobj=null;
	if(tempUser != null && tempPass != null) {
		userobj=userService.LoginWithEmailPassword(tempUser,tempPass);
	}
	if(userobj == null) {
		throw new Exception ("Bad Credential"); 
		}
		return userobj;
		
	}
	@PostMapping("/createUser")
	public ResponseEntity createCustomer(@Valid @RequestBody UserDto userdto, Errors errors) 
	{
		String response = "";
		if (errors.hasErrors()) {
			System.out.println("errors");
		
		response = errors.getAllErrors().stream().map(ObjectError::getDefaultMessage)
				.collect(Collectors.joining(","));
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode(HttpStatus.NOT_ACCEPTABLE.value());
		error.setMessage(response);
		return ResponseEntity.ok(error);
	} else {
		
		System.out.println(userdto);
			 response = userService.createUser(userdto);
			 return ResponseEntity.ok(response);}
		  
			
	
}
	
	@GetMapping("/viewUser/{id}")
	public UserDto viewusers(@PathVariable  String id){
		UserDto userobj=null;
		userobj=userService.getById(id);
		return userobj;
	}
	

	@GetMapping("/allUsers")
	public List<UserDto> viewusers(){
		
		List<UserDto> userobj=userService.getAllUsers();
		return userobj;
	}
}
	
