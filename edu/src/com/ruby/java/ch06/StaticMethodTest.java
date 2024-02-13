package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;
	public static void main(String[] args) {
		StaticMethodTest.print1(); // static 메소드라 사용 가능(클래스 메소드)
//		StaticMethodTest.print2(); 인스턴스를 생성하지 않아 사용 불가(인스턴스 메소드)
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}
	
	public static void print1() {
//		int num2 = num; // 인스턴스 생성후 num변수 사용가능 -> 오류 발생
		System.out.println("hello");
	}
	
	public void print2() {
		int num3 = num; 
		System.out.println("java");
	}

}
