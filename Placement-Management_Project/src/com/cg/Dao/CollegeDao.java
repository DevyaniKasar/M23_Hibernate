package com.cg.Dao;

import com.cg.Entities.College;

public interface CollegeDao 
{
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(long id);
	boolean deleteCollege(long id);
	
	void beginTransaction() ;
	void commitTransaction();
	boolean deleteCollege(int id);
	College searchCollege(int id);

}
