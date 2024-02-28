package com.ruby.java.ch14;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	
	public static void test(MyInterface mi) { // 인터페이스를 매개변수로 사용 가능
		mi.print();
	}
	
	public static MyInterface test2() { // 인터페이스 타입을 반환값으로 선언 가능
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		
		return mi;
	}
	
	public static void main(String[] args) {
		
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); // MyClass1
		mc2.print(); // MyClass2
		
		// 익명클래스로 인터페이스 구현 -> 아래에서 계속해서 사용하는 경우에 좋음
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
	
		test(mc1);  // MyClass1
		test(mi);   // 익명 클래스로 구현
		
		mi.print(); // 익명 클래스로 구현
		
		// 선언, 생성, 호출을 한꺼번에 처리 -> 한번만 사용하고 사용하지 않을 경우에 좋음
		(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print();  // 선언, 생성, 호출을 한번에 처리
		
		MyInterface mi2 = test2();
		mi2.print(); // test2() 메서드에서 반환된 MyInterface
	} 
}
