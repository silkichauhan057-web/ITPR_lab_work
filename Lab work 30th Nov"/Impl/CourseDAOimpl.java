package com.knmodicolledgecolledgemanagement.collegemanagement.dao.impl;


import com.knmodicolledgecolledgemanagement.collegemanagement.dao.FacultyDAO;
import com.knmodicolleg.collegemanagement.modal.Course;
import com.knmodicolleg.collegemanagement.modal.Faculty;
import com.knmodicollege.collegemanagement.util.databaseutil;
import java.sql.*; 
import java.util.ArrayList;


/*
	 * ------- Structure Of the Course ---------
	 * table : course
	 * --------------------------------------
	 * fields - datatype - 
	 * courseid - varchar(30) - primary key
	 * coursename - varchar(300) - not null 
	 * description - varchar(1000) - not null
	 * duration - int - not null
	 * min_enrollment - int - not null 
	 * max_enrollment - int  - not null
	 * */
	public class CourseDAOimpl implements CourseDAO
	{

		@Override
		public int save(Course courseData) 
		{
			int insertedRows = 0;
			try(Connection con =databaseutil.establishConnection())
			{
				//to create reference of preparedStatement interface
				PreparedStatement stmt = con.prepareStatement("insert into course values(?,?,?,?,?,?)");
				//setting query parameters
				stmt.setString(1, courseData.getCourseId());
				stmt.setString(2, courseData.getCourseName());  
				stmt.setString(3, courseData.getDescription());
				stmt.setInt(4, courseData.getDuration());
				stmt.setInt(5, courseData.getMinEnrollment());
				stmt.setInt(6, courseData.getMaxEnrollment());
				
				//to exceute the query   
				insertedRows = stmt.executeUpdate();
			} 
			catch(SQLException sqe)
			{
				System.out.println(sqe);
			}
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ArrayList<Course> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Course findByCourseId(String courseId) {
			// TODO Auto-generated method stub
			return null;
		}
		 
	}
