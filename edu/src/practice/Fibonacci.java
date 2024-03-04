package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하시오: ");
		int N = sc.nextInt();
		int []fiboArr = new int[N+1];
		
		fiboArr[0] = 0;
		fiboArr[1] = 1;
		for(int i=2; i<N+1; i++) {
			fiboArr[i] = fiboArr[i-1] + fiboArr[i-2];
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(fiboArr[i] + ", ");
		}
		System.out.print(fiboArr[N]);
	}
}
