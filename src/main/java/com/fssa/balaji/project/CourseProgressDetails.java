package com.fssa.balaji.project;

import java.time.LocalDate;

public class CourseProgressDetails {
	String userName;
	String courseName;
	String SubModule;
	String endrolledDate;
	double progPercent;
	

	public String getEndrolledDate() {
		return endrolledDate;
	}
	public void setEndrolledDate(String endrolledDate) {
		this.endrolledDate = endrolledDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSubModule() {
		return SubModule;
	}
	public void setSubModule(String subModule) {
		SubModule = subModule;
	}
	public double getProgPercent() {
		return progPercent;
	}
	public void setProgPercent(double progPercent) {
		this.progPercent = progPercent;
	}

	

	
}