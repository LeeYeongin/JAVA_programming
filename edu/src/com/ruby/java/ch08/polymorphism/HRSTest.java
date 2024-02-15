package com.ruby.java.ch08.polymorphism;

abstract class Employee{
	String name;
	int salary;
	
	public abstract double calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{

	@Override
	public double calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
		return 200.0;
	}

	@Override
	public void calcBonus() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	
//	public String toString() {
//		return "세일즈맨";
//	}

//	public void calcSalary() {
//		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
//	}
//	
//	public void calcBonus() {
//		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
//	}
}

class Consultant extends Employee{
	public double calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
		return 400.0;
	}
	
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee {
	// calcBonus를 구현하지 않았기 때문에 추상클래스로 선언
	public double calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		return 600.0;
	}
}

class Director extends Manager {
	// Manager를 상속받으므로 calcBonus를 구현(오버라이딩)해야함
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
	
	public double calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		return 800.0;
	}
}

public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
		double tax = e.calcSalary() * 0.1;
		System.out.println("세금="+tax);
	}
//	public static void calcTax(Salesman s) {
//		// Employee의 하위클래스를 받는 메소드이므로 상위클래스인 Employee를 입력받아 사용불가
//	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Employee e = new Salesman();
		Director d = new Director();
		HRSTest h = new HRSTest();
		
		// static 함수라 아래 3가지 방법 모두 가능
		// 동적바인딩
		HRSTest.calcTax(s);
		h.calcTax(e); 
		calcTax(d);
		
//		Salesman s2 = s;
//		System.out.println(s.toString());
//		System.out.println(s2.toString());
//		// 결과 -> com.ruby.java.ch08.polymorphism.Salesman@1f32e575
//		//    	  com.ruby.java.ch08.polymorphism.Salesman@1f32e575 -> 같은 객체임을 알 수 있음
//		
//		if(s.equals(s2)) {
//			System.out.println("같은 객체");
//		}else {
//			System.out.println("다른 객체");
//		}
		
		s.calcBonus();
		e.calcBonus();
		d.calcBonus();
	}

}
