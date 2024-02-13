package com.ruby.java.ch06;

public class ArmorTest {
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		
		suit1.setName("mark6");
		suit1.setHeight(180);
		
		suit2.setName("mark16");
		suit2.setHeight(220);
		
		{ // Block안에 선언된 경우 지역변수 이므로 block밖으로 나가면 사라짐
			Armor suit3 = new Armor();
			suit3.setName("mark38");
			suit3.setHeight(200);
			
		}
		
		Armor suit4 = new Armor();
		suit4 = null;
//		suit4.setName("mark6"); suit4가 null을 가리키고 있어 오류 발생
//		suit4.setHeight(180);
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
//		System.out.println(suit3.getName() + " : " + suit3.getHeight()); 오류 발생
//		System.out.println(suit4.getName() + " : " + suit4.getHeight()); suit4가 null을 가리키고 있어 오류 발생
	}
}
