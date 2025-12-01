
  package com.knmodicolledgecolledgemanagement.collegemanagement;
import com.knmodicolledgecolledgemanagement.collegemanagement.dao.impl.CourseDAOimpl;
import com.knmodicolleg.collegemanagement.modal.Course;
import com.knmodicollege.collegemanagement.util.databaseutil;  

public class App 
{
    public static void main( String[] args )
    {
    	//to create tables if not exists
    	databaseutil.createTables();
    	
    	Course course1 = new Course("course102", "ITPR", "Introduction to java programming", 120, 20, 70);
    	CourseDAOimpl cdi = new CourseDAOimpl();
    	int rows = cdi.save(course1); 
    	  
    	if(rows > 0)
    	{ 
    		System.out.println("Data inserted");
    	}
    	else
    	{
    		System.out.println("Unable to insert data");
    	}
    }
}









