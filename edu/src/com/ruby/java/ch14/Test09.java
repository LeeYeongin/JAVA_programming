package com.ruby.java.ch14;

interface Calculator {
	int func();
}

public class Test09 {
	
	static int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09 test = new Test09();
		int num3 = 30;
		
		Calculator calc = () -> {
			int num4 = 40;
			Test09.num1++;
			test.num2++; // test는 수정이 불가하지만 test의 필드값은 수정 가능
//			test = new Test09();
//			num3++; // 람다식에서는 지역변수를 사용할수는 있으나 수정은 불가(final 취급)
			num4++;
			return num4;
		};
	}
}
