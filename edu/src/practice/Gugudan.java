package practice;

public class Gugudan {
	
	// 단 하나를 출력하는 메소드
	public void print(int num) {
		for(int i=1; i<10; i++)
			System.out.println(num + " * " + i + " = " + (num*i));
	}
	// 구구단을 순서대로 출력하는 메소드
	public void printVertical() {
	// print 메소드를 사용하도록 코드 작성
		for(int i=2; i<10; i++) {
			print(i);
			System.out.println();
		}
	}
	
	// 구구단을 가로로 순서대로 출력하는 메소드
	public void printHorizontal() {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
	
	// 원하는 col수 만큼 가로로 출력하는 메소드
	public void printColumn(int col) {
		// 교수님 제공 코드
		if (9<col) {
			System.out.println("col is not valid![1-9]");
		}
		
		for(int i=2; i<10; i+=col) {
			for(int j=1; j<10; j++) {
				for(int k=0; k<col; k++) {
					if(10<=i+k) {
						System.out.print("\n");
						break;
					}
					System.out.printf("%d * %d = %d", (i+k), j, (i+k)*j);
					
					if (k < col-1) System.out.print("\t");
					else			System.out.print("\n");
				}
			}
			System.out.println();
		}
		
		
//		int n = 8/col;
//		int start = 2;
//		int tmp = start + col;
//		
//		if(8 % col != 0)
//			n += 1;
//		
//		for(int k=0; k<n; k++) {
//			for(int i=1; i<10; i++) {
//				for(int j=start; j<tmp; j++) {
//					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
//				}
//				System.out.println();
//			}
//			start = tmp;
//			tmp += col;
//			
//			if(tmp > 10)
//				tmp = 10;
//			System.out.println();
//		}
		
	}
}
