package com.ruby.java.ch03;

public class Test22 {
	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		char op = '/';
		
		switch(op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default: // 위의 아무조건에 맞지 않을 때
			System.out.println(a + ", " + b);
		}
	}

}
