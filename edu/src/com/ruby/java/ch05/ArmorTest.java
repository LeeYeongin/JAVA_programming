package com.ruby.java.ch05;

class Armor {
	private String name = "홍길동"; // private라 외부에서 접근할 수 없음
	private int height = 180;
	private int weight = 100; 
	String color = "Red";
	
	void takeOff() {
		// body
		System.out.println("Take Off"); 
	}
	private void land() {
		System.out.println("Land");
	}
	private void shootLaser() {
		System.out.println("Shoot Laser");
	}
}

public class ArmorTest{
	public static void main(String[] args) {
		Armor armor = new Armor();
		
		System.out.println(armor.color);
		armor.takeOff();
//		armor.land(); private 메소드라 사용 불가
		
//		armor.name = "홍이동"; private이라 값 지정 불가 -> public 메소드를 사용하여 값 지정(Setter)
//													+ 가져올때는 Getter 메소드 사용
	}
}
