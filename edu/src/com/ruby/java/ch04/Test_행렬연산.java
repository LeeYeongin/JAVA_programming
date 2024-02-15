package com.ruby.java.ch04;

import java.util.Random;

/*
 * 하나의 자바 파일에서 함수 구현 실습(class 없이)
 */
public class Test_행렬연산 {
	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의
	 * 1차버젼: 덧셈후 바로 출력
	 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */
	static void showMatrix(int [][]X) { // static은 객체를 생성하지 않고 사용가능
		//2차원 모습으로 출력
		for(int i=0; i<X.length; i++) {
			for(int j=0; j<X[0].length; j++) {
				System.out.print(X[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	static void getData(int [][]X) {
		Random rand = new Random();
		for(int i=0; i<X.length; i++) {
			for(int j=0; j<X[0].length; j++) {
				X[i][j] = rand.nextInt(10);
			}
		}
	}
	
	
	static int[][] addMatrix(int [][]B, int [][]C){
		int row = B.length;
		int col = B[0].length;
		int m[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				m[i][j] = B[i][j] + C[i][j];
			}
		}
		
		return m;
	}
	
	static int[][] multiplyMatrix(int[][] B, int[][] E){
		int row = B.length;
		int col = E[0].length;
		int m[][] = new int[row][col];
		int tmp = 0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				for(int k=0; k<B[0].length; k++) {
					tmp += B[i][k] * E[k][j];
				}
				m[i][j] = tmp;
				tmp = 0;
			}
		}
		
		return m;
	}
	
	static int[][] transposeMatrix(int [][]B){
		int col = B.length;
		int row = B[0].length;
		int m[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				m[i][j] = B[j][i];
			}
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		int A[][], D[][], F[][];
		int B[][] = new int[3][4];
		int C[][] = new int[3][4];
		int E[][] = new int[4][5];
		
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		getData(B);getData(C);getData(E);
		A = addMatrix(B, C);
		showMatrix(B);showMatrix(C);showMatrix(A);
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = multiplyMatrix(B,E);
		showMatrix(B);showMatrix(E);showMatrix(D);
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = transposeMatrix(B);
		showMatrix(B);showMatrix(F);

	}

}
