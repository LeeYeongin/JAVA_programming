package com.ruby.java.ch05;

public class Armor1 {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		
		String num = takeOff('a', 'b'); // takeOff라는 메소드가 리턴하는 값을 num에 저장
		System.out.println(num);
		
//		System.out.println(takeOff()); // 7,8번줄과 똑같은 동작
		
//		takeOff(); // print 함수안에 void 타입의 메소드 사용 불가
		
		System.out.println("3");
		System.out.println("4");
	}
	
	// int, String, long, boolean, char
	static String takeOff(char num1, char num2) {
	System.out.println("Take Off");
	
	return num1 + " ===> " + num2;
	}
	
	
//	static int takeOff() {
//		System.out.println("Take Off");
//		
//		return 100;
//	}
	
//	static long takeOff() {
//		System.out.println("Take Off");
//		
//		return 100;
//	}
	
//	static boolean takeOff() {
//		System.out.println("Take Off");
//		
//		return true;
//	}
	
//	static char takeOff() {
//		System.out.println("Take Off");
//		
//		return '9';
//	}

}
