package com.airlines.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlines.pojo.Ticket;
import com.airlines.pojo.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	//Finds the User from database with matching username and password
	User findByUsernameAndPassword(String username,String password);
	
}
