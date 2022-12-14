package com.cg.Dao;

import javax.persistence.EntityManager;

import com.cg.Entities.User;

    public class UserDaoImpl implements UserDao
    {
     private EntityManager em;
	
	

	public UserDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}



	@Override
	public User addUser(User user) {
		em.persist(user);
		return user;
	}



	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}



	@Override
	public boolean deleteUser(int user_id) {
		em.remove(user_id);
		return false;
	}



	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}



	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
}
