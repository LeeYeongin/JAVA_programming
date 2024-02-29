package practice;

import java.util.Scanner;

//정수의 자릿수를 입력받아서 해당 자릿수에 속하는 소수를 찾아서 출력하는 프로그램

public class PrimeNumber2 {
	// 소수인지 확인하는 메소드
	boolean isPrime(int num) {
		boolean check = true;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				check = false;
				break;
			}
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		
		PrimeNumber2 pn = new PrimeNumber2();
		Scanner sc = new Scanner(System.in);
		System.out.print("자릿수를 입력하세요: ");
		int N = sc.nextInt();
		
		int start = (int) Math.pow(10, N-1);	
		int end = (int) Math.pow(10, N)-1;
		
		// 입력받은 자릿수에 해당하는 숫자 중 소수만 출력
		for(int i=start; i<=end; i++) {
			if(pn.isPrime(i))
				System.out.print(i + " ");
		}
	}
}
