package com.cg.spring.controller;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.exception.ErrorMessage;
import com.cg.spring.exception.InvalidUserDetails;
import com.cg.spring.json.User;

import springfox.documentation.service.ResponseMessage;

class UserControllerTest {

	public static Logger logger =  LogManager.getLogger(UserControllerTest.class);
/*
	// Test For User Login
		@Test
		void testUserLogin() {
			RestTemplate restTemplate = new RestTemplate();
			logger.info("[START] testUserLogin()");
			ResponseEntity<User> responseEntity = restTemplate.getForEntity
					("http://localhost:9090/myapp/user/john123@gmail.com/john@123",User.class);
			logger.info("Login Successful");
			assertNotNull(responseEntity);
			logger.info("[END] testUserLogin()");
		}
		
		
		// Test For If User Enter Invalid EmailId
		@Test
		void testUserLoginForInavaliEmailId() {
			RestTemplate restTemplate = new RestTemplate();
			logger.info("[START] testUserLoginForInavaliEmailId()");
			Exception exception = assertThrows
					(org.springframework.web.client.HttpClientErrorException.BadRequest.class, 
					() -> {
						restTemplate.getForEntity("http://localhost:9090/myapp/user/john12@gmail.com/john@123",User.class);
					});
			logger.info("Invalid EmailId");
			logger.info("[END] testUserLoginForInavaliEmailId()");
		}
		
		
		// Test For If User Enter Invalid Password
		@Test
		void testUserLoginForInavaliPassword() {
			RestTemplate restTemplate = new RestTemplate();
			logger.info("[START] testUserLoginForInavaliPassword()");
			Exception exception = assertThrows
					(org.springframework.web.client.HttpClientErrorException.BadRequest.class, 
					() -> {
						restTemplate.getForEntity("http://localhost:9090/myapp/user/john123@gmail.com/john@12",User.class);
					});
			logger.info("Invalid Password");
			logger.info("[END] testUserLoginForInavaliPassword()");
		}
		
		
		// Test For If User Enter Invalid EmaiId and Invalid Password
		@Test
		void testUserLoginForInavaliData() {
			RestTemplate restTemplate = new RestTemplate();
			logger.info("[START] testUserLoginForInavaliData()");
			Exception exception = assertThrows
					(org.springframework.web.client.HttpClientErrorException.BadRequest.class, 
					() -> {
						restTemplate.getForEntity("http://localhost:9090/myapp/user/john12@gmail.com/john@12",User.class);
					});
			logger.info("Invalid EmailId and Inavalid Password");
			logger.info("[END] testUserLoginForInavaliData()");
		}
		
				
		// Test For If User Wants to Update Password 
		@Test
		void testUpdatePassword() {
			RestTemplate restTemplate = new RestTemplate();
			logger.info("[START] testUpdatePassword()");
						User user = restTemplate.getForObject
								("http://localhost:9090/myapp/user/tom123@gmail.com/tom@123", User.class);
						user.setPassword("tom@12");
						restTemplate.put("http://localhost:9090/myapp/user/update/tom123@gmail.com/tom@123", user, User.class);
						
						logger.info("Password Updated Successfully");
						logger.info("[END] testUpdatePassword()");
					}
		
		// Test For If user attempt 3 consecutive login failure then account is locked
				@Test
				void testUserAccountIsLocked() {
					RestTemplate restTemplate = new RestTemplate();
					logger.info("[START] testUserAccountIsLocked()");
					Exception exception = assertThrows
							(org.springframework.web.client.HttpClientErrorException.BadRequest.class, 
							() -> {
								restTemplate.getForEntity("http://localhost:9090/myapp/user/jerry123@gmail.com/jerry@123",User.class);
							});
					logger.info("Account is Locked Due to 3 consecutive failure attempts of login");
					logger.info("[END] testUserAccountIsLocked()");
				}
				
					
	*/		
	}
		
