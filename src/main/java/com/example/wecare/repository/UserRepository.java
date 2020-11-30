package com.example.wecare.repository;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.wecare.dto.UserDto;
import java.util.List;
import java.io.Serializable;
@Repository
public interface  UserRepository  extends MongoRepository<UserDto, Serializable> {
	 public List<UserDto> findAll();
	public UserDto FindByEmailPassword(String email, String password);
	public UserDto FindById(String id);
	 }
