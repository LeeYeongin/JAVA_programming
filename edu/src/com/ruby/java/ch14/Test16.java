package com.ruby.java.ch14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class Test16 {
	
	public static void main(String[] args) {
		// Consumer<T>: T타입 인자 처리(반환값 없음)
		Consumer<Date> date = (d) -> {
			String s = new SimpleDateFormat("YY-MM-dd").format(d);
			System.out.println(s);
		};
		
		date.accept(new Date());
	}
}
