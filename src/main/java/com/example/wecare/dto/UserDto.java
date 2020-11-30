package com.example.wecare.dto;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
@Entity
@Document(collection="UserInfo")

public class UserDto {
	public UserDto(String id,
			@NotBlank @NotEmpty @NotNull(message = "Phone number should be present, please check") String user_id,
			@NotNull(message = "Phone number should be present, please check") String name, String gender,
			String date_of_birth, String password, String mobile_number, String email, String pincode, String city,
			String state, String country) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.name = name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.password = password;
		this.mobile_number = mobile_number;
		this.email = email;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Id
	String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotBlank()
	@NotEmpty()
	@NotNull(message = "Phone number should be present, please check")
	String user_id;
	
	@NotNull(message = "{user.name}")
	 String name;
	
	@NotNull(message = "{user.gender}")
	 String gender;
	
	@NotNull(message = "{user.date_of_birth}")
	 String date_of_birth;
	
	@NotNull(message = "{user.password}")
	 String password;
	
	@NotNull(message = "{user.mobile_number}")
	 String mobile_number;
	
	@NotNull(message = "{user.email}")
	 String email;
	
	@NotNull(message = "{user.pincode}")
	 String pincode;
	
	@NotNull(message = "{user.city}")
	 String city;
	
	@NotNull(message = "{user.state}")
	 String state;
	
	@NotNull(message = "{user.country}")
	 String country;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", user_id=" + user_id + ", name=" + name + ", gender=" + gender
				+ ", date_of_birth=" + date_of_birth + ", password=" + password + ", mobile_number=" + mobile_number
				+ ", email=" + email + ", pincode=" + pincode + ", city=" + city + ", state=" + state + ", country="
				+ country + ", getId()=" + getId() + ", getUser_id()=" + getUser_id() + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getDate_of_birth()=" + getDate_of_birth() + ", getPassword()="
				+ getPassword() + ", getMobile_number()=" + getMobile_number() + ", getEmail()=" + getEmail()
				+ ", getPincode()=" + getPincode() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getCountry()=" + getCountry() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
