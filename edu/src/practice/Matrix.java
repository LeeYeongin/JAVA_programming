package practice;

import java.util.Random;

/*
 * 24개의 원소를 가지는 정수형 1차원배열을 선언해서 랜덤으로 값을 입력
	1.입력된 배열 출력 & 오름차순으로 정렬한 뒤 출력
	2.배열을3by4 A1행렬과3by4 B1행렬로 만들어서 행렬합을 구한 뒤 출력
	3.배열을3by4 A2행렬과4by3 B2행렬로 만들어서 행렬곱을 구한 뒤 출력
	4.배열을4by3 A3행렬과3by4 B3행렬로 만들어서 행렬곱을 구한 뒤 출력
*/

public class Matrix {
	int[][] m = null;
	
	public Matrix(int[] array, int s, int r, int c) {
		this.m = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				this.m[i][j] = array[s++];
			}
		}
	}
	
	public Matrix(int[][] m) {
		this.m = m;
	}

	public void print() {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static Matrix sum(Matrix mA, Matrix mB) {
		int[][] a = mA.m;
		int[][] b = mB.m;
		int[][] result = new int[a.length][a[0].length];
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return new Matrix(result);
	}
	
	public static Matrix multiple(Matrix mA, Matrix mB) {
		int[][] a = mA.m;
		int[][] b = mB.m;
		int[][] result = new int[a.length][b[0].length];
		int sum = 0;
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				for(int k=0; k<a[0].length; k++) {
					sum += a[i][k] * b[k][j];
				}
				result[i][j] = sum;
				sum = 0;
			}
		}
		return new Matrix(result);
	}
	
	public static void main(String[] args) {
		int[] array = new int[24];
		
		for(int i=0; i<24; i++) {
			array[i] = i;
		}
		
		System.out.println("array:");
		for(int i=0; i<24; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n");
		
		// 2.배열을3by4 A1행렬과3by4 B1행렬로 만들어서 행렬합을 구한 뒤 출력
//		Matrix mA = new Matrix(array, 0, 3, 4);
//		Matrix mB = new Matrix(array, 12, 3, 4);
//		System.out.println("mA:");
//		mA.print();
//		System.out.println("mB:");
//		mB.print();
//		Matrix mC = Matrix.sum(mA, mB);
//		System.out.println("mC(mA + mB):");
//		mC.print();
		
		// 3.배열을3by4 A2행렬과4by3 B2행렬로 만들어서 행렬곱을 구한 뒤 출력
//		Matrix mA = new Matrix(array, 0, 3, 4);
//		Matrix mB = new Matrix(array, 12, 4, 3);
//		System.out.println("mA:");
//		mA.print();
//		System.out.println("mB:");
//		mB.print();
//		Matrix mC = Matrix.multiple(mA, mB);
//		System.out.println("mC(mA * mB):");
//		mC.print();
		
//		4.배열을4by3 A3행렬과3by4 B3행렬로 만들어서 행렬곱을 구한 뒤 출력
		Matrix mA = new Matrix(array, 0, 4, 3);
		Matrix mB = new Matrix(array, 12, 3, 4);
		System.out.println("mA:");
		mA.print();
		System.out.println("mB:");
		mB.print();
		Matrix mC = Matrix.multiple(mA, mB);
		System.out.println("mC(mA * mB):");
		mC.print();
		
	}
}
