package com.ruby.java.ch14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class Test17 {
	
	public static void main(String[] args) {
		// Supplier<T>: 인자 없이 처리 후 T 타입 값 반환
		Supplier<String> day = () -> new SimpleDateFormat("E요일").format(new Date());
		String result = day.get();
		System.out.println(result);
	}

}
