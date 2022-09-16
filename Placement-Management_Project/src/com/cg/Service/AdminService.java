package com.cg.Service;

import com.cg.Entities.Admin;

public interface AdminService {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	boolean logout();

}
