package practice;

import java.util.Scanner;

/*
 [경우의 수]
 2g, 3g, 5g의 추가 각각 10개씩 있을 때, 10~100사이의 임의의 값을 입력 받고,
 추의 합이 입력 받은 값이 되는 경우를 찾아서 출력하세요. 단, 각각의 추는 1개
 이상은 사용되어야 합니다.
*/
public class Practice01 {
	
	static void calculate(int num) {
		int total = num - 10;
		int remain1, remain2;
		int count = 0;
	
		for(int i = 0; i <= total/2; i++) {
			remain1 = total - i*2;
			for(int j = 0; j <= remain1/3; j++) {
				remain2 = remain1 - j*3;
				if(remain2 % 5 == 0) {
					int k = remain2/5 + 1;
					System.out.print("(" + (i+1) + "," + (j+1) + "," + k +")");
					count++;
				}	
			}
		}
		
		System.out.print(" : " + count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10~100사이의 값을 입력하세요: ");
		int num = sc.nextInt();
		
		calculate(num);
	}

}
