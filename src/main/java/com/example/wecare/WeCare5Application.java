package com.example.wecare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.wecare.dto.UserDto;
import com.example.wecare.repository.UserRepository;

@SpringBootApplication
public class WeCare5Application{

	
	public static void main(String[] args) {
		SpringApplication.run(WeCare5Application.class, args);
		
	}


}
