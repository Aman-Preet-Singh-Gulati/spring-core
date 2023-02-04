package com.springcore;

public class Student {
	
	private String studentID;
	private String studentName;
	private String studentAddress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		System.out.println("Calling student id's setter function");
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Calling student name's setter function");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Calling student address's setter function");
		this.studentAddress = studentAddress;
	}
	
	

}
