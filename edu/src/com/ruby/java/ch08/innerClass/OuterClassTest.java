package com.ruby.java.ch08.innerClass;

class OuterClass {
	class InstanceClass {
		int a;// 같은 패키지 내에서 접근 가능(default)
		
		void method2() {
			System.out.println("Instance Class : " + a);
		}
	}
	
	static class StaticClass {
		int b;
		static int c;
		void method3() {
			System.out.println("Static Class : " + b);
		}
		static void method4() {
			System.out.println("Static Class : " + c);
		}
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
//		outer.InstanceClass inner02 = outer.new InstanceClass(); // class가 아닌 객체가 나왔으므로 오류 발생
		inner01.a = 123;
		inner01.method2();
		
		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
		OuterClass.StaticClass.c = 789; // static이라 객체를 생성하지 않고 접근 가능
		OuterClass.StaticClass.method4();
	}
}
