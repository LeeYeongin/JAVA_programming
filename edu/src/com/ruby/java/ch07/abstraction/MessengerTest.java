package com.ruby.java.ch07.abstraction;

public class MessengerTest {

	public static void main(String[] args) {
		
		IphoneMessenger iphone = new IphoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		// 아래처럼도 사용가능
//		Messenger iphone = new IphoneMessenger();
//		Messenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기" + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기" + Messenger.MAX_SIZE);

		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		iphone.draw_textBox();
		iphone.draw_submitButton();
		
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		galaxy.fileDownlaod();
		galaxy.fileUpload();
	}
}
