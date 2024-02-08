package com.ruby.java.ch04;

import java.util.Random;

public class Test38Matrix {
	public static void main(String[] args) {
		int A[][] = new int[3][4]; // 난수 입력
		int B[][] = new int[4][5]; // 난수 입력
		int C[][] = new int[3][5];
		int D[][] = new int[3][4]; // 난수 입력
		int E[][] = new int[3][4];
		int F[][] = new int[4][3];
	

		Random rand = new Random();
		
		// A배열 난수 입력
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = rand.nextInt(10);
			}
		}
		
		System.out.println("A행렬");
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
		
		// B배열 난수 입력
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[i].length; j++) {
				B[i][j] = rand.nextInt(10);
			}
		}
		
//		System.out.println("B행렬");
//		for(int i = 0; i < B.length; i++) {
//			for(int j = 0; j < B[i].length; j++) {
//				System.out.print(B[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		// D배열 난수 입력
		for(int i = 0; i < D.length; i++) {
			for(int j = 0; j < D[i].length; j++) {
				D[i][j] = rand.nextInt(10);
			}
		}
		
		// C = A * B 행렬 곱하기 (a11*b11 + a12*b21 + a13*b31 = c11, A의 열의 수 = B의 행의 수)
//		int sum = 0;
//		for(int i = 0; i < C.length; i++) {
//			for(int j = 0; j < C[0].length; j++) {
//				for(int k = 0; k < C[0].length; k++) {
//					sum += A[i][k] * B[k][j];
//				}
//				C[i][j] = sum;
//				sum = 0;
//			}
//		}
//		
//		System.out.println("C행렬");
//		for(int i = 0; i < C.length; i++) {
//			for(int j = 0; j < C[i].length; j++) {
//				System.out.print(C[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
		

		
		
		// E = A + D 행렬 더하기 (같은 행, 열끼리 더하기)
		for(int i = 0; i < E.length; i++) {
			for(int j = 0; j < E[0].length; j++) {
				E[i][j] = A[i][j] + D[i][j];
			}
		}
		
		
		
		// F = A의 전치 행렬 (행열이 뒤바뀜)
		for(int i = 0; i < F.length; i++) {
			for(int j=0; j< F[0].length; j++) {
				F[i][j] = A[j][i];
			}
		}
		
		System.out.println("F행렬");
		for(int i = 0; i < F.length; i++) {
			for(int j = 0; j < F[i].length; j++) {
				System.out.print(F[i][j] + "\t");
			}
			System.out.println();
		}
				

	}

}
