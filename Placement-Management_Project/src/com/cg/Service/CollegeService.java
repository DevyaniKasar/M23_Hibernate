package com.cg.Service;

import com.cg.Entities.College;


public interface CollegeService {
	College addCollege(College college);
	College updateCollege(College college);
	boolean deleteCollege(long id);
	College searchCollege(long id);

}
