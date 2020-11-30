package com.example.wecare.dto;
import javax.persistence.GenerationType;
import javax.persistence.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
@Document(collection="CoachInfo")
public class CoachDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer coach_id;
	public CoachDto(Integer coach_id, String name, String gender, String date_of_birth, String password,
			String mobile_number, String speciality) {
		super();
		this.coach_id = coach_id;
		this.name = name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.password = password;
		this.mobile_number = mobile_number;
		this.speciality = speciality;
	}
	@Override
	public String toString() {
		return "CoachDto [coach_id=" + coach_id + ", name=" + name + ", gender=" + gender + ", date_of_birth="
				+ date_of_birth + ", password=" + password + ", mobile_number=" + mobile_number + ", speciality="
				+ speciality + "]";
	}
	public Integer getCoach_id() {
		return coach_id;
	}
	public void setCoach_id(Integer coach_id) {
		this.coach_id = coach_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	@NotNull(message = "{coach.name}")
	private String name;
	
	@NotNull(message = "{coach.gender}")
	private String gender;
	
	@NotNull(message = "{coach.date_of_birth}")
	private String date_of_birth;
	
	@NotNull(message = "{coach.password}")
	private String password;
	
	@NotNull(message = "{coach.mobile_number}")
	private String mobile_number;
	
	@NotNull(message = "{coach.speciality}")
	private String speciality;
}
