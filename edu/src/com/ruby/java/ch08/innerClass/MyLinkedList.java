package com.ruby.java.ch08.innerClass;

public class MyLinkedList {
	private Node head = null;
	
	// 내부 클래스: 관련 있는 것은 모으고 관련 없는 것은 서로 분리한다의 예시
	private class Node {
		private String data;
		private Node link;
		
		public Node(String data) {
			// 생성자는 필드가 2개 이므로 heap에 필드 공간 2개를 할당
			this.data = data;
			this.link = null;
		}
		
		public Node(String data, Node link) {
			this.data = data;
			this.link = link;
		}
	}
	
	public void add(String data) {
		// 참조변수 -> stack에 저장
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		} else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	
	public void print() {
		if(head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
	
	public MyLinkedList() {
		this.head = null;
	}
	
	public MyLinkedList(Node head) {
		this.head = head;
	}
}
