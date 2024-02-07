package com.ruby.java.ch03;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a:");
		int a = sc.nextInt();
		System.out.print("b:");
		int b = sc.nextInt();
		System.out.print("op:");
		char op = sc.next().charAt(0);
		
		if(op == '+') {
			System.out.println(a+b);
		} else if(op == '-') {
			System.out.println(a-b);
		} else if(op == '*') {
			System.out.println(a*b);
		} else if(op == '/' ) {
			System.out.println(a/b);
		}

	}

}
