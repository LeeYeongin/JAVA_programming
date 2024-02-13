package practice;

/*
 * 3*4 행렬과 4*3 행렬을 선언하고 두 행렬의 곱을 계산해서 출력하세요.
 */
public class Practice02 {
	int[][] mA = { // 3 * 4
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
	};
		
	int[][] mB = { // 4 * 3
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{10, 11, 12}
	};
	
	Integer [][] mR = new Integer[3][3];
	
	public void multiple() {
		int tmp = 0;
		for(int i=0; i<mR.length; i++) {
			for(int j=0; j<mR[0].length; j++) {
				for(int k=0; k<mA[0].length; k++) {
					tmp += mA[i][k]*mB[k][j];
				}
				mR[i][j] = tmp;
				tmp = 0;
			}
		}
	}
	
	public void print() {
		for(int i=0; i<mR.length; i++) {
			for(int j=0; j<mR[0].length; j++) {
				System.out.print(mR[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Practice02 t1 = new Practice02();
		t1.multiple();
		t1.print();
	}
}
