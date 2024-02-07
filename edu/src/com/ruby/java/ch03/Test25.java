package com.ruby.java.ch03;

import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num: ");
		int num = sc.nextInt();

		int sum1 = 0; // 홀수 합 
		int sum2 = 0; // 짝수 합

//		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
//			System.out.println(i);
			
			/* 전체 합 구하기
			 * sum += i; 
			 * System.out.println("-> " + sum);
			 */
			
			if(i % 2 == 0) { // 짝수
				sum2 += i;
				System.out.println("e ->" + sum2);
			}else { // 홀수
				sum1 += i;
				System.out.println("o ->" + sum1);
			}
		}
		
		System.out.println("OK :" + sum2 + ", " + sum1);
	}

}
