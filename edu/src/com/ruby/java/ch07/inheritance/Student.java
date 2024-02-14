package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("Student 생성자");
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student 생성자");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + " : " + major;
	}
}
