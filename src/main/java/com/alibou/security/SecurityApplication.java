package com.alibou.security;

import com.alibou.security.auth.AuthenticationService;

import com.alibou.security.auth.dto.RegisterRequestDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.alibou.security.user.entity.Role.ADMIN;
import static com.alibou.security.user.entity.Role.MANAGER;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		//return null;
		return args -> {
			var admin = RegisterRequestDTO.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.cf("RSNNDR81S20G702P")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequestDTO.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.cf("RSNNDR81S20G702T")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

		};
	}

	 */
}
