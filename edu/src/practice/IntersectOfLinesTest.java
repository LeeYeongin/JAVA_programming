package practice;

import java.util.Scanner;

public class IntersectOfLinesTest {

	public static void main(String[] args) {
		IntersectOfLines IoL = new IntersectOfLines();
		int[] result = new int[2];
		boolean noIntersect = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("4개의 x,y좌표 쌍을 입력하시오(x1, y1, x2, y2, x3, y3, x4, y4):");
		IoL.x1 = sc.nextInt();
		IoL.y1 = sc.nextInt();
		IoL.x2 = sc.nextInt();
		IoL.y2 = sc.nextInt();
		IoL.x3 = sc.nextInt();
		IoL.y3 = sc.nextInt();
		IoL.x4 = sc.nextInt();
		IoL.y4 = sc.nextInt();
		
		noIntersect = IoL.GetIntersect(result, noIntersect);
		if(noIntersect)
			System.out.println("두 직선이 평행하여 교점이 없습니다.");
		else
			IoL.printIntersect(result);
	}
}
