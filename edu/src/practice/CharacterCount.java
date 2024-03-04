package practice;

public class CharacterCount {
	public static void main(String[] args) {
		String s = "Programming is fun! right?";
		System.out.println(s);
		s = s.toLowerCase();
		char[] arr = s.toCharArray();
		int countM=0, countJ=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'|| arr[i] == 'u')
				countM++;
			else if(97 <= arr[i] && arr[i] <= 122) // 아스키코드 값으로 계산하기 (char -> int로 변환 가능)
				countJ++;
		}
		
		System.out.println("자음: " + countJ + "개, 모음: " + countM + "개");
	}
}
