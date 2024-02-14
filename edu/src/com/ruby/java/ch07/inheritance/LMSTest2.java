package com.ruby.java.ch07.inheritance;

public class LMSTest2 {

	public static void main(String[] args) {
		// 데이터 생성시 바로 할당 가능
		Employee e = new Employee("오정임", 47, "입학처");
		Professor p = new Professor("홍길동", 40, "자바");
		Student s = new Student("김유빈", 20, "컴퓨터 과학");
		
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}

}
