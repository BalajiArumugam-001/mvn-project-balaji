package com.fssa.balaji.project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseProgressDetailsValidator {
	public static boolean validate(CourseProgressDetails prog) {
		if (prog == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		nameValidator(prog.userName);
		courseNameValidator(prog.courseName);
		subModuleValidator(prog.SubModule);
		enrolledDateValidator(prog.endrolledDate);
		progPercentValidator(prog.progPercent);
		return true;
		
	}
	// name validate
	public static boolean nameValidator(String name)throws IllegalArgumentException {
		if (name == null || "".equals(name.trim())) {
			throw new IllegalArgumentException("Name cannot be empty or null");
		}
		
		String nameregex= "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(name);
		Boolean isMatch = matcher.matches();
		
		if(!isMatch) {
			throw new IllegalArgumentException("Name should be in minimum 2 letters  and maximum 30 letters");
			
		}
		return true;
		
	}
	
	// CourseName validate
		public static boolean courseNameValidator(String coursename)throws IllegalArgumentException {
			if (coursename == null || "".equals(coursename.trim())) {
				throw new IllegalArgumentException("Course Name  cannot be empty or null");
			}
			
			String nameregex= "^[A-Za-z]{2,25}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(coursename);
			Boolean isMatch = matcher.matches();
			
			if(!isMatch) {
				throw new IllegalArgumentException("Course Name should be in minimum 2 letters  and maximum 25 letters");
				
			}
			return true;
			
		}
		
		// SubModule validate
		public static boolean subModuleValidator(String submodule)throws IllegalArgumentException {
					if (submodule == null || "".equals(submodule.trim())) {
						throw new IllegalArgumentException("Sub module cannot be empty or null");
					}
					
					String nameregex= "^[A-Za-z]{2,20}$";
					Pattern pattern = Pattern.compile(nameregex);
					Matcher matcher = pattern.matcher(submodule);
					Boolean isMatch = matcher.matches();
					
					if(!isMatch) {
						throw new IllegalArgumentException("Sub module should be in minimum 2 letters  and maximum 20 letters");
						
					}
					return true;
					
		}
		// Endrolled date validate
			public static boolean enrolledDateValidator(String enrolldate)throws IllegalArgumentException {
							if (enrolldate == null || "".equals(enrolldate.trim())) {
								throw new IllegalArgumentException("Enrolled Date cannot be empty or null");
							}
							String nameregex= "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
							Pattern pattern = Pattern.compile(nameregex);
							Matcher matcher = pattern.matcher(enrolldate);
							Boolean isMatch = matcher.matches();
							
							if(!isMatch) {
								throw new IllegalArgumentException("Enrolled date should be in 1/11/2011  or 1.11.2011   or 1-11-2011");
								
							}
							return true;
							
				}
			// Progress Percentage validate
			  public static boolean progPercentValidator(double progPercent)throws IllegalArgumentException {
										if(progPercent > 0 && progPercent <= 100) {
											return true;
										}
										throw new IllegalArgumentException("Progress should be between 1.00 and 100.00");
										
							}
	
}
