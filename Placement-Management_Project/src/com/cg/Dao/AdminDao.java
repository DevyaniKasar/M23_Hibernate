package com.cg.Dao;

import com.cg.Entities.Admin;

public interface AdminDao {
	
	public Admin addNewAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(long id);
	
	void beginTransaction();
	void commitTransaction();

}
