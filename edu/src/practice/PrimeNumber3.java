package practice;

import java.util.Scanner;

/*  
 * 	정수의 자릿수를 입력 받아서 아래와 같은 형태의 소수를 찾아서 출력하는 프로그램
 *  Ex) • 입력자릿수: 4 (1000 ~ 9999)
 *	    • 7331 ➔ 7, 73, 733, 7331 모두 소수
*/

public class PrimeNumber3 {
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
		
		PrimeNumber3 pn = new PrimeNumber3();
		Scanner sc = new Scanner(System.in);
		System.out.print("자릿수를 입력하세요: ");
		int N = sc.nextInt();
		
		int start = (int) Math.pow(10, N-1);	
		int end = (int) Math.pow(10, N)-1;
		
		int slice;
		boolean flag;
		
		// 입력받은 자릿수에 해당하는 숫자 중 소수만 출력
		for(int i=start; i<=end; i++) {
			slice = 1;
			flag = true;
			
			// 7331 ➔ 7, 73, 733, 7331 처럼 모두 소수인지 확인
			for(int j=0; j<N; j++) {
				if(!pn.isPrime(i/slice)) { // 한가지 경우라도 소수가 아닌경우
					flag = false;
					break;
				}
				slice = slice*10;
			}
			
			// 조건에 맞는 소수인경우 출력
			if(flag)
				System.out.print(i + " ");
		}
	}
}
