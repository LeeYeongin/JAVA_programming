package practice;

import java.util.Scanner;

public class LeafYear {
	boolean isLeafYear(int year) {
		boolean result = false;
		
		if(year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)))
			result = true;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		LeafYear y = new LeafYear();
		
		System.out.println(y.isLeafYear(num)? num + "년은 윤년입니다." : num + "년은 윤년이 아닙니다.");
		
//		for(int i = 2024; i<2124; i++) {
//			System.out.print(y.isLeafYear(i)? i + ", " : "");
//		}
		
	}
}
