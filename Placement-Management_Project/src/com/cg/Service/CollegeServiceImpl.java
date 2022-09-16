package com.cg.Service;

import com.cg.Entities.College;
import com.cg.Dao.CollegeDao;
import com.cg.Dao.CollegeDaoImpl;


public class CollegeServiceImpl implements CollegeService
{
	private CollegeDao cd;
	
	public CollegeServiceImpl() {
		cd=new CollegeDaoImpl();
	}

	@Override
	public College addCollege(College college) {
		cd.beginTransaction();
		cd.addCollege(college);
		cd.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		cd.beginTransaction();
		cd.updateCollege(college);
		cd.commitTransaction();
		return null;
	}

	@Override
	public College searchCollege(long id) {
		College college=cd.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		cd.beginTransaction();
		boolean res=cd.deleteCollege(id);
		cd.commitTransaction();
		return res;
	}

	

	

}