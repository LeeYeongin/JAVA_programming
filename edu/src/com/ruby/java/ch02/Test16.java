package com.ruby.java.ch02;

public class Test16 {

	public static void main(String[] args) {
		byte a = 23;
		int b = a; // 작은 타입을 큰 타입으로 자동으로 변경 (implicit casting)
		a = (byte)b; // 큰 타입을 작은 타입으로 변경하기위해 explicit casting 필요(정보손실 발생 가능)
		
		byte i = 10;
		byte j = 20;
		// +는 정수에 대한 operator -> i, j를 자동으로 정수(int)로 바꿔 계산 -> 정수 결과값을 byte k에 삽입 시도 -> 오류발생
		byte k = (byte)(i + j); // type casting 필요
	}

}
