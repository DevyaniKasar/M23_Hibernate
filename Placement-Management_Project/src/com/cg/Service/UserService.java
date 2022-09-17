package com.cg.Service;

import com.cg.Entities.User;

 public interface UserService {
	public abstract User addUser(User user);
	public abstract User updateUser(User user);
	public abstract User loginUser (User user);
	public abstract boolean logoutUser(int user_id);
	
}
