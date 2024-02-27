package com.ruby.java.ch13.study;

/*제네릭 : 데이터 타입을 매개변수로 지정하는 것을 의미
장점: 불필요한 타입 변경을 없애줌*/

class Bag {
	private Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("타입은 " + thing.getClass().getName());
	}
}

class Book {}
class PencilCase {}
class NoteBook {}

public class BagTest2 {
	public static void main(String[] args) {
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new NoteBook());
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2; // 같은 Bag type으로 여겨 오류 발생하지 않음
	}
}
