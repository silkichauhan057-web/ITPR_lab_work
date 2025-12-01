package com.knmodicolledgecolledgemanagement.collegemanagement.controller;



import java.util.Scanner;

import java.util.*;
import com.knmodicolleg.collegemanagement.modal.*;
import com.knmodicollege.collegemanagement.service.*;
import com.knmodicollege.collegemanagement.service.Impl.*;


public class CourseController {
	

	private CourseService courseService;
	public CourseController()
	{
		//to initailize service
		courseService = new CourseServiceImpl();
	}
	
	
	
	
	public void registerCourseUI()
	{
		Scanner sc = new Scanner(System.in);

		String choice = "y";

		do {
		    System.out.print("Enter Course ID: ");
		    String courseId = sc.nextLine();

		    System.out.print("Enter Course Name: ");
		    String courseName = sc.nextLine();

		    System.out.print("Enter Course Description: ");
		    String courseDesc = sc.nextLine();

		    System.out.print("Enter Course Duration: ");
		    int duration = sc.nextInt();

		    System.out.print("Enter Course Min Enrollment: ");
		    int minEnroll = sc.nextInt();

		    System.out.print("Enter Course Max Enrollment: ");
		    int maxEnroll = sc.nextInt();

		    // consume leftover newline before nextLine()
		    sc.nextLine();
		    //calling register method
		    courseService.registerCourse(new Course(courseId, courseName, courseDesc, duration, minEnroll, maxEnroll));
		    
		   

		    System.out.println("Do You want to enter more data (y | n) :");
		    choice = sc.nextLine();

		} while (!choice.equalsIgnoreCase("n"));

		sc.close();

		
	}
	
	
	

	public static void main(String[] args) {


	}

}



