package com.fssa.balaji.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCourseProgress {
//  for valid Username
	@Test

	public void testValidName() {
		Assertions.assertTrue(CourseProgressDetailsValidator.nameValidator("Balaji"));
	}
//  for valid CourseName
	@Test
	public void testCourseName() {
		Assertions.assertTrue(CourseProgressDetailsValidator.courseNameValidator("WebDevelopment"));
	}
//  for valid SubModule
	@Test
	public void testValidModuleName() {
		Assertions.assertTrue(CourseProgressDetailsValidator.subModuleValidator("JS"));
	}
//  for valid Date
	@Test
	public void testValidEnrolledDate() {
		Assertions.assertTrue(CourseProgressDetailsValidator.enrolledDateValidator("1/11/2011"));
	}
//  for valid Progress
	@Test
	public void testValidProgPercent() {
		Assertions.assertTrue(CourseProgressDetailsValidator.progPercentValidator(50.55));
	}
	
}
