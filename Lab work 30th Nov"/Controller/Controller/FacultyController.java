package com.knmodicolledgecolledgemanagement.collegemanagement.controller;


package com.jdbcconnectivity.learningmanagementsystem.controller;
import com.jdbcconnectivity.learningmanagementsystem.service.*;
import com.jdbcconnectivity.learningmanagementsystem.service.impl.*;
import com.jdbcconnectivity.learningmanagementsystem.model.Faculty;

import java.util.*;

public class FacultyController {

private FacultyService facultyService;
	
	//constructor
	public FacultyController()
	{
		//to initailize service
		facultyService = new FacultyServiceImpl();
	}
	//user interface for registration of new faculty
	public void registerFacultyUI()
	{
		Scanner sc = new Scanner(System.in);
		//input of faculty id
		System.out.print("Enter Faculty id : ");
		String facultyId = sc.nextLine();
		//input of faculty name
		System.out.print("Enter Faculty Name : ");
		String name = sc.nextLine();
		//input of faculty qualification
		System.out.print("Enter Qualification : ");
		String qualification = sc.nextLine();
		//input of faculty status
		System.out.print("Enter Status : ");
		String status = sc.nextLine();
	
		
		//calling register method
		facultyService.registerFaculty(new Faculty(facultyId, name, qualification,status));
		
	}

}
