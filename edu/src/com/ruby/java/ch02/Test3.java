package com.ruby.java.ch02;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float exchangeRate = (float)1236.50; // type casting
											 // (explicit conversion: 명시적 변환 <-> implicit conversion: 묵시적 변환)
		float exchangeRate2 = 1236.50F; // F를 붙여 float타입임을 표기해야함. 안하면 double로 처리(간주)
		String st = "Good Day";
		int num = 2147483647;
		int numSize = Integer.SIZE;
		System.out.println("numSize= " + numSize);
		long d = 2147483648L; // L을 붙여 long타입임을 표기해야함. 안하면 int(4byte)로 처리
		// d 변수가 8바이트 확인 방법은?
		int dSize = Long.SIZE;
		System.out.println("dSize= " + dSize);
	}

}
