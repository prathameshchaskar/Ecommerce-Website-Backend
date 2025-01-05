package com.prathamesh.service;

import java.util.List;

import com.prathamesh.exception.UserException;
import com.prathamesh.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();
}
