package practice;

import java.util.Scanner;

public class BinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp = 1;
		int result = 0;
		
		while(true) {
			result += (num % 2)*tmp;
			if(num/2 == 0)
				break;
			else
				num /= 2;
			tmp *= 10;
		}	
		
		System.out.println("result: " + result);
	}
}
