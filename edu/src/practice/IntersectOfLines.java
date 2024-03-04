package practice;

public class IntersectOfLines {
	public int x1, y1, x2, y2, x3, y3, x4, y4;
	
	public boolean GetIntersect(int[] result, boolean flag) {
		int tmp = (x1-x2)*(y3-y4)-(y1-y2)*(x3-x4);
		int x_ = (x1*y2-y1*x2)*(x3-x4)-(x1-x2)*(x3*y4-y3*x4);
		int y_ = (x1*y2-y1*x2)*(x3-x4)-(y1-y2)*(x3*y4-y3*x4);
		if(tmp == 0) {
			flag = true;
		}
		else {
			result[0] = x_ / tmp;
			result[1] = y_ / tmp;
		}
		
		return flag;
	}
	
	public void printIntersect(int[] result){
		System.out.print("("+x1+","+y1+")-("+x2+","+y2+"), ("
					+x3+","+y3+")-("+x4+","+y4+"): ("+result[0]+","+result[1]+")");
	}
}
