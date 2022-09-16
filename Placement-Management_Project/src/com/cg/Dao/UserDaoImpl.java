package com.cg.Dao;

import javax.persistence.EntityManager;

import com.cg.Entities.User;

public class UserDaoImpl implements UserDao
{
	//Starting JPA LifeCycle
	private EntityManager entityManager;
	
	//Constructor
	public UserDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updatedUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(long id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
