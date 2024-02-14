package com.ruby.java.ch07.abstraction;

public class Salesman1 extends Employee1 {

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");

	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");

	}

}
