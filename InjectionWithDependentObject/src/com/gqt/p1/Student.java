package com.gqt.p1;

public class Student {
	int id;
	String name;
	String college;
	
	Grade grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(college);
		System.out.println(grade);
	}
}
