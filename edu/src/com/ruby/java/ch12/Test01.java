package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
	public static void main(String[] args) {
		// 1byte씩 입출력
		try (FileInputStream fi = new FileInputStream("a.txt");
				FileOutputStream fo = new FileOutputStream("b.txt");){
			int c = 0;
			while((c = fi.read()) != -1) {
				fo.write(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
