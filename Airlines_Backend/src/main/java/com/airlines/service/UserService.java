package com.airlines.service;

import java.util.Collection;

import com.airlines.bean.Login;
import com.airlines.exception.UserException;
import com.airlines.pojo.User;

public interface UserService {
	
	 int createUser(User user) throws UserException;
	
	 User fetchUserById(int user_id) throws UserException;
	 
	 User validate(Login login);
	
	 public Collection<User> fetchAllUsers();
	
}
