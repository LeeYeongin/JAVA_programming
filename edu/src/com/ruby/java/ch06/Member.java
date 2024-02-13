package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
//	public Member() { // 기본 생성자
//		System.out.println("Member() 생성자 실행");
//	}
//	
//	public Member(String name) {
//		this.name = name;
//		System.out.print("Member(String) 생성자 실행 :");
//		System.out.println(name);
//	}
//	
//	public Member(int age) {
//		this.age = age;
//		System.out.print("Member(int) 생성자 실행 :");
//		System.out.println(age);
//	}
//	
//	public Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//		System.out.print("Member(String, int) 생성자 실행 :");
//		System.out.println(name + " : " + age);
//	}
//	
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
	
	public Member() {
		this("guest");
	}
	
	public Member(String name) {
		this(name, 0);
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
//		return "Member [name=" + name + ", age=" + age + "]";
		return name + ":" + age;
	}

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
//		System.out.println("main() 메서드 실행");
//		new Member();
//		new Member("Amy");
//		new Member(23);
//		new Member("Amy", 23);
//		Member m = new Member("Anna", 20);
//		System.out.println(m.toString());

	}
}
