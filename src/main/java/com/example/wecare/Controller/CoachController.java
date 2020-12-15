package com.example.wecare.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wecare.dto.UserDto;
import com.example.wecare.sevice.UserService;
import com.example.wecare.sevice.CoachService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.wecare.dto.CoachDto;
@RestController
@RequestMapping("/coach")
public class CoachController {
	@Autowired
	private CoachService coachService;
	@PostMapping("/loginCoach")
	@PostMapping("/loginCoach")
	public CoachDto createUser( @RequestBody CoachDto coachdto) throws Exception
	{ String tempUser=coachdto.getName();
	String tempPass=coachdto.getPassword();
	CoachDto userobj=null;
	if(tempUser != null && tempPass != null) {
		userobj=coachService.LoginWithEmailPassword(tempUser,tempPass);
	}
	if(userobj == null) {
		throw new Exception ("Bad Credential"); 
		}
		return userobj;
		
	}
	@GetMapping("/viewCoach/{coach_id}")
	public CoachDto viewusers(@PathVariable  String coach_id){
		CoachDto coachobj=null;
		coachobj=coachService.getById(coach_id);
		return coachobj;
	}
	

	@GetMapping("/allCoaches")
	public List<CoachDto> viewusers(){
		
		List<CoachDto> userobj=coachService.getAllCoaches();
		return userobj;
	}
}
