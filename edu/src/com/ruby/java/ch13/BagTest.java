package com.ruby.java.ch13;

/*제네릭 : 데이터 타입을 매개변수로 지정하는 것을 의미
장점: 1. 불필요한 타입 변경을 없애줌
 	 2. 엄격한 타입 검사를 통해 안전성을 높여준다*/

class Bag<T> {
	private T thing;
	
	public Bag() {	}

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {}
class PencilCase {}
class NoteBook {}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<NoteBook> bag3 = new Bag<>(new NoteBook());
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
//		bag = bag2; // 오류 발생
		
//		Bag<Book> bag = new Bag<>();
//		bag.setThing(new Book());
//		bag.showType();
	}
}
