package com.cg.Service;

import com.cg.Entities.User;

public interface UserService {

	User addNewUser(User user) ; 
	User updateUser(User user) ; 
	User login(User user); 
	boolean logOut();
}
