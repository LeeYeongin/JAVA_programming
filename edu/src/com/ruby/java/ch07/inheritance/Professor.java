package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		System.out.println("Professor 생성자");
	}

	public Professor(String name, int age, String subject) {
//		super.setName(name); // super constructor가 가장 앞에 있어야함
//		super.setAge(40);
		super(name, age);
		this.subject = subject;
		System.out.println("Professor 생성자");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override // 상속을 받았기때문에 오버라이딩 가능
	public String toString() {
		return super.toString() + " : " + subject;
	}
}
