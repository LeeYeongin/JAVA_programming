package com.ruby.java.ch04;

public class Test32 {
	public static void main(String[] args) {
		int[] score;
//		score = {1,2,3,4,5}; // 치환문이기 때문에 초기화 불가(공간 할당이 되지 않음)
		score = new int[] {1,2,3,4,5};
		int num =score.length;
		System.out.println("num = " + num);
		String str = "nice day";
		int snum = str.length();
		System.out.println("snum = " + snum);
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */
	}
}
