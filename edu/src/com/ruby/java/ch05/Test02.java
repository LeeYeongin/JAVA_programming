package com.ruby.java.ch05;

public class Test02 {
	static void test(String name, int... v) { // 가변길이 인자는 복합 선언시 마지막에 한번만 사용가능
		System.out.print(name + " : ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("김푸름", 90, 95, 92);
		test("김하늘", 80, 98, 95);
		test("가나다", 80, 95);
	}
}
