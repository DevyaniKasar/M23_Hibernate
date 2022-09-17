package com.cg.Dao;

import com.cg.Entities.User;

public interface UserDao {
	public abstract User addUser(User user);
	public abstract User updateUser(User user);
	public abstract boolean deleteUser(int user_id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
