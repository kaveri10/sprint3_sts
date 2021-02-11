package com.cg.spring.service;

import javax.validation.Valid;

import com.cg.spring.exception.InvalidDataException;
import com.cg.spring.json.Login;
import com.cg.spring.json.User;

public interface UserService {

	
	
	public User updatePassword(String emailId, String oldpassword, String newpassword) throws InvalidDataException;
	public Login userLogin(@Valid Login login) throws  InvalidDataException;
	public User createUser(@Valid User user);
	//public Login updatePassword(@Valid Login login, String newpassword) throws  InvalidDataException;
	

}
