package com.ruby.java.ch05;

public class Test01 {
	static void test(int... v) { // 가변 길이 인자 선언(0~여러개의 인자를 받음)
		System.out.print(v.length + " : ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);
		test(1, 2, 3, 4);
	}
}