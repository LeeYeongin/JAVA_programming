package com.ruby.java.ch14;

import java.util.Arrays;

interface StringFunc2 {
	String[] modify(String s) throws EmptyStringException;
}

class EmptyStringException extends Exception {
	public EmptyStringException() {
		super("빈 문자열");
	}
}

public class Test08 {
	
//	public static void main(String[] args) throw EmptyStringException{ 이런식으로 예외처리를 하면 프로그램이 끝까지 실행되지 않고 오류 부분에서 끊어짐(End 출력 X)
	public static void main(String[] args){
		String str = "Korea,Australia,China,Spain,Turkey";
		
		StringFunc2 sf = (s) -> {
			if(s.length() == 0)
				throw new EmptyStringException();
			return s.split(",");
		};
		
		String result[];
		try {
			result = sf.modify(str);
			System.out.println(Arrays.toString(result));
			
			String str2 = "";
			String result2[] = sf.modify(str2);
			System.out.println(Arrays.toString(result2));
			
		} catch (EmptyStringException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
