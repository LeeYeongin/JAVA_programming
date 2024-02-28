package practice;

public class Gugudan {
	public void printHorizontal() {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
	
	public void printColumn(int col) {
		int n = 8/col;
		int start = 2;
		int tmp = start + col;
		
		if(8 % col != 0)
			n += 1;
		
		for(int k=0; k<n; k++) {
			for(int i=1; i<10; i++) {
				for(int j=start; j<tmp; j++) {
					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
				}
				System.out.println();
			}
			start = tmp;
			tmp += col;
			
			if(tmp > 10)
				tmp = 10;
			System.out.println();
		}
		
	}
}
