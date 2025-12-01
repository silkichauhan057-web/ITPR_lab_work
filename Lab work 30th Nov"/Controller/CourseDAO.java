package com.knmodicolledgecolledgemanagement.collegemanagement.dao;
import com.knmodicolleg.collegemanagement.modal.Course;
import java.util.ArrayList;
public interface CourseDAO 
{
	//method for inserting new coursedata
	int save(Course courseData);
	
	//method to fetch all course list
	ArrayList<Course> findAll();
	
	//method to fetch a particular course
	Course findByCourseId(String courseId ,int duration); 
//	method to fatch all courses
	void getCourseList();
//	method to fatch course detail of a paricular course
	void getCourseDetails(String CourseID);
	
//	
}
