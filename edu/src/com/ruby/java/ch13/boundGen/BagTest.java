package com.ruby.java.ch13.boundGen;

/*제네릭 : 데이터 타입을 매개변수로 지정하는 것을 의미
장점: 1. 불필요한 타입 변경을 없애줌
 	 2. 엄격한 타입 검사를 통해 안전성을 높여준다*/

class Bag<T extends Solid> {
	private T thing;

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

class Solid {}
class Liquid {}

class Book extends Solid{}
class PencilCase extends Solid{}
class NoteBook extends Solid{}

class Water extends Liquid {}
class Coffee extends Liquid {}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<NoteBook> bag3 = new Bag<>(new NoteBook());
		
		// Solid를 상속하지 않는 Water와 Coffee를 타입 인자로 사용하여 오류 발생
//		Bag<Water> bag4 = new Bag<>(new Water());
//		Bag<Coffee> bag5 = new Bag<>(new Coffee());
	}
}
