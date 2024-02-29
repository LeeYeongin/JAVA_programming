package com.ruby.java.ch14;

interface StringFunc {
	String modify(String s);
}

public class Test07 {
	static String test(StringFunc sf, String s) {
		return sf.modify(s);
	}
	
	public static void main(String[] args) {
		
		String str = "Korea,Australia,China,Spain,Turkey";
		StringFunc sf1 = (s) -> {
			String result = "";
			char c;
			for(int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if(c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};
		
		String s1 = test(sf1, str); // 참조 변수를 사용
		System.out.println(s1);
		
		String s2 = test((s) -> { // 람다식 자체를 매개변수로 바로 사용
			int max = 0;
			int index = 0;
			String[] word = s.split(",");
			for(int i = 0; i<word.length; i++) {
				if(max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];
		}, str);
		
		System.out.println(s2);
	}

}
