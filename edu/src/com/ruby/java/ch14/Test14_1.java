package com.ruby.java.ch14;

import java.util.function.Function;

// 최상위 추상 클래스 Geometry 생성 -> 추상 메서드로 면적구하는 메서드 선언
abstract class Geometry{
	abstract double getArea();
}

// 자식 클래스 생성 -> Circle, Rectangle, Triangle
class Circle extends Geometry {
	int radius = 3;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return (double)(radius * radius * Math.PI);
	}
}

class Rectangle extends Geometry {
	int width = 3;
	int height = 4;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return (double)(width * height);
	}
}

class Triangle extends Geometry {
	int width = 3;
	int height = 4;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return (double)(width * height * 0.5);
	}
}

public class Test14_1 {
	public static void main(String[] args) {
		// 람다식 작성
		Function<Geometry, Double> func = (g) -> {
			double area = 0;
			area = g.getArea();
			
			return area;
		};
		
		// 출력
		System.out.println("원 면적: " + func.apply(new Circle(5)));
		System.out.println("사각형 면적: " + func.apply(new Rectangle(5,10)));
		System.out.println("삼각형 면적: " + func.apply(new Triangle(5,10)));
		
	}
}
