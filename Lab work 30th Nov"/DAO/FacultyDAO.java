package com.knmodicolledgecolledgemanagement.collegemanagement.dao;
import com.knmodicolleg.collegemanagement.modal.Faculty;
import java.util.ArrayList;

package com.jdbcconnectivity.learningmanagementsystem.dao;
import com.jdbcconnectivity.learningmanagementsystem.model.Faculty;

import java.util.ArrayList;

import com.jdbcconnectivity.learningmanagementsystem.model.Course;


package com.jdbcconnectivity.learningmanagementsystem.dao;
import com.jdbcconnectivity.learningmanagementsystem.model.Faculty;

import java.util.ArrayList;

import com.jdbcconnectivity.learningmanagementsystem.model.Course;

public interface FacultyDAO {
	/*---- to insert data into the table ----*/
	int save(Faculty facultyData);
	
	/*--- to fetch complete faculty list ---*/
	ArrayList<Faculty> findAll();
	
	//method to delete the faculty
	int delete(String facultyId);
	
	/*--- to fetch faculty details based on faculty id ----*/
	Course findByFacultyId(String facultyId);
	
	/*---- to update Faculty Status by Faculty Id ---*/
	int updateFacultyStatusByFacultyId(String facultyId, String status);
}