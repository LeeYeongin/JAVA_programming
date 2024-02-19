package com.ruby.java.ch08.innerClass;

interface Messenger {
	String getMessage();
	void setMessage(String msg);
}

class GalaxyMessenger implements Messenger{ // 인터페이스가 구현된 클래스(이름 O)
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
	}
	
	public String getMessage() {
		return "galaxy";
	}
	
}

public class MessengerTest {
	public static void main(String[] args) {
//		Messenger test = new Messenger(); Messenger는 인터페이스 이므로 바로 생성 불가
		
		GalaxyMessenger galaxy = new GalaxyMessenger();
		galaxy.setMessage("hi");
		
		Messenger test = new Messenger() { // 추상 메소드가 구현된 클래스 -> 클래스 이름이 없으므로 익명 클래스
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
	}
}
