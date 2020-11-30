package com.example.wecare.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.wecare.dto.CoachDto;

import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface CoachRepository extends MongoRepository<CoachDto, Serializable> {
	public CoachDto FindByEmailPassword(String email, String password);
	 public List<CoachDto> findAll();
		public CoachDto FindById(String coach_id);
}