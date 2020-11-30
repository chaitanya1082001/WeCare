package com.example.wecare.sevice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.wecare.repository.CoachRepository;
import com.example.wecare.dto.CoachDto;
import com.example.wecare.dto.UserDto;

@Service
public class CoachService {

	@Autowired
	private CoachRepository coachRepository;
	
	public String createCoach(CoachDto coachDTO)
	{
		 var ch= coachRepository.save(coachDTO);
		 return "saved successfully";
	}
	
	public CoachDto LoginWithEmailPassword(String email, String password)
	{
		return coachRepository.FindByEmailPassword(email,password);
		  
	}
	public CoachDto getById(String coach_id )
	{
		return coachRepository.FindById(coach_id);
		  
	}
	public List<CoachDto> getAllCoaches( )
	{
		return coachRepository.findAll();
		  
	}
}
