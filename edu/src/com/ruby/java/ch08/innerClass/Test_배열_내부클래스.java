package com.ruby.java.ch08.innerClass;

class Node3 {
	int data;
	Node3 link;
	public Node3(int data) {
		this.data = data; link = null;
	}
}

class LinkedList3 {
	Node3 first;
	
	public LinkedList3() {
		first = null;
	}
	
	void append(int data) {
		Node3 p = first, q = null;
		Node3 newNode = new Node3(data);
		
		if(p == null) {
			first = newNode;
		} else {
//			while(p.link != null) {
//				p = p.link;
//			}
//			p.link = newNode;
			while(p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode;
		}
		
		return;
	}
	
	void showList() {
		int count = 0;
		
		System.out.println();
		Node3 p = first;
		
		while(p.link != null) {
			count++;
			p = p.link;
		}
		count++;
		
		p = first;
		
		for(int i=0; i < count; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
			
		for (int i = 0; i < count; i++) {
			if (p.data < 10)
				System.out.print(" ");
			System.out.print(p.data+ " ");
			p = p.link;
		}
		
		System.out.println();
	}
	
	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;
		
		while(p != null) {
			if(p.data > data) {
				newNode.link = p;
				if(q == null) {
					first = newNode;
				} else {
					q.link = newNode;
				}
				break;
			}else {
				q = p;
				p = p.link;
			}
		}
	}
}

public class Test_배열_내부클래스 {
	static int getList(int[]data) {
		int count = 0;
		int mid = data.length/2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5; count++;
		}
		return count;
	}
	
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i]+ " ");
		}
		System.out.println();
	}
	
	static int insertList(int[] data, int count, int x) {
		
		int indx = 0;

		while(indx < count) {
			if(data[indx] > x) {
				while (indx <= count) {
					int tmp = data[indx];
					data[indx] = x;
					x = tmp;
					indx++;
				}
				break;
			} else {
				indx++;
			}
		}
		
		count++;
		
		return count;
	}
	
	public static void main(String[] args) {
		int[]list = new int[10];
		int count = 0; // count 배열의 갯수
		
		// 배열
		System.out.println("배열로 리스트::");
		count = getList(list);
		showList(list);
		count = insertList(list, count, 3);
		showList(list);
		count = insertList(list, count, 7);
		showList(list);
	
		
		// linked list
		LinkedList3 ll = new LinkedList3();
		ll.append(5);ll.append(10);ll.append(15);ll.append(20);ll.append(25);
		ll.showList();
		ll.insert(3);ll.showList();
		ll.insert(7);ll.showList();
	}
}
