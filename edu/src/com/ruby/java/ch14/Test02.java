package com.ruby.java.ch14;

@FunctionalInterface
interface Muliply {
	double getValue();
//	void setValue(); //@FunctionalInterface를 사용하여 함수형 인터페이스임을 지정했으므로 오류 발생
}

public class Test02 {
	
	public static void main(String[] args) {
		
		Muliply m = () -> 3.14 * 2; // 람다식은 함수형 인터페이스만 가능
		System.out.println(m.getValue());
		
		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}

}
