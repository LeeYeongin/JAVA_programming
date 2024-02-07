package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {
	public static void main(String[] args) {
		// 난수 생성하기
		Random rnd = new Random(); // Random이 클래스 - 난수 생성된 클래스
		int [] score = new int[20];
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 99;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(20); // 20미만의 정수가 랜덤으로 생성
		}
		
//		for(int num : score) {
//			System.out.print(num + " ");	
//		}
		for(int i = 0; i < score.length; i++) {
			if (i % 4 == 0) {
				System.out.print("\n");
			}
			if (score[i] < 10) {
				System.out.print(" ");
			}
			System.out.print(score[i] + " ");
		}
		
		
		for(int i = 0; i < score.length; i++) {
			// 총점
			sum += score[i];
			// 최댓값
			if(max < score[i])
				max = score[i];
			// 최솟값
			if(min > score[i])
				min = score[i];
		}
		
		// 평균
		avg = sum / score.length;
		
		System.out.println("\n총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
