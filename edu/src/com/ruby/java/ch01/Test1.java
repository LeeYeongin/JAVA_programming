package com.ruby.java.ch01;

public class Test1 {

	public static void main(String[] args) {
		{
			// println : 한 라인에 한개씩 출력하는 코드
			System.out.println("이름 : 이영인");
			System.out.println("성별 : 여");
			System.out.println("학교 : 부산대학교");
			System.out.println("나이 : 25");
		}
		System.out.println("=".repeat(50));
		{
			// print : 한 라인에 전체를 한꺼번에 출력하는 코드
			// \t : 탭키 삽입
			// \n : 다음줄로 이동
			System.out.print("이름 : 이영인\t");
			System.out.print("성별 : 여\n");
			System.out.print("학교 : 부산대학교\t");
			System.out.print("나이 : 25\t");
		}
	}

}