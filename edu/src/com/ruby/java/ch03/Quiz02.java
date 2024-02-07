package com.ruby.java.ch03;

import java.util.Scanner;

// 정수의 자릿수를 입력 받아서 해당 자릿수에 속하는 소수를 찾아 출력하기
public class Quiz02 {
	public static void main(String[] args) {
		// 숫자 하나 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Num: ");
		int num = sc.nextInt();
		
		// 입력받은 자릿수에 속하는 정수의 처음값과 마지막 값
		int s = (int)Math.pow(10.0, (double)(num - 1));
		int e = (int)Math.pow(10.0, (double)num) - 1;
		
		boolean flag = true;
		
		for(int i = s; i <=e ; i++) { // 입력받은 자릿수 처음~마지막
			// 소수 찾기
			for(int j=2; j < i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			// 소수 출력
			System.out.print(flag? (i + " ") : "");
			flag = true;
		}
		
	}
}
