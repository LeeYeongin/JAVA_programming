package com.ruby.java.ch03;

public class Test31 {
	public static void main(String[] args) {
//		for(int i = 1; i < 10; i++) {
//			for(int j = 2; j < 10; j++) {
//				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
//			}
//			System.out.print("\n");
//		}
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println("\n");
		}
	}
}
