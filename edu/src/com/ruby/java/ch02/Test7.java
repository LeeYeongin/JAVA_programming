package com.ruby.java.ch02;

public class Test7 {
	public static void main(String[] args) {
		boolean isOn = false;
		while(!isOn) {
			// 반복 실행(조건이 true일 때)
		}
		short e = 10;
		int f = -e; // 부호변경은 기본적으로 int형으로 처리되기 때문에 오류발생(short -> int로 변경) 
		int a = 10;
		int b = 1, c = 0;
		c = -b;
		b = ++a;
		c = a++;
		System.out.println("b = " + b + ", c = " + c);
		System.out.println("a = " + a);
		
		boolean result = (b == c);
		System.out.println("result = " + result);
	}
}
