package com.cg.Service;


import com.cg.Dao.UserDao;
import com.cg.Dao.UserDaoImpl;
import com.cg.Entities.User;

public class UserServiceImpl implements UserService
{
	private UserDao dao;
	
	public UserServiceImpl() {
		super();
		dao=new UserDaoImpl();
	}

	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User loginUser(User user) {
		
		return null;
	}

	@Override
	public boolean logoutUser(int user_id) {
		
		return false;
	}

	
}
