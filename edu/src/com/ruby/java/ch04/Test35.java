package com.ruby.java.ch04;

public class Test35 {
	public static void main(String[] args) {
		String []st = {"apple", "banana", "peach", "pineapple"};
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		for(int num : arr)  // 간결한 코딩 - 배열 원소 전부 출력 + 인덱스 사용이 필요하지 않을 때
			System.out.println(num);
		
		for (String stx: st)
			System.out.println(stx);
	}
}
