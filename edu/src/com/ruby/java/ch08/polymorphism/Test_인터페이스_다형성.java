package com.ruby.java.ch08.polymorphism;
/*
 * 인터페이스 다형성 실습 코드
 */
interface Vehicle {
	public abstract void showVehicle();
}

class Truck implements Vehicle {
	int weight;
	public Truck(int weight) {
		this.weight=weight;
	}
	public void showVehicle() {
		System.out.println("Truck: weight="+weight);
	}
}

class Car implements Vehicle {
	int vehicleOccupants;

	public Car(int vehicleOccupants) {
		this.vehicleOccupants = vehicleOccupants;
	}

	@Override
	public void showVehicle() {
		System.out.println("Car: vehicleOccupants="+vehicleOccupants);
	}

}

class Taxi extends Car {
	int mileage;

	public Taxi(int vehicleOccupants, int mileage) {
		super(vehicleOccupants);
		this.mileage = mileage;
	}
	
	@Override
	public void showVehicle() {
		super.showVehicle();
		System.out.println("Taxi: mileage="+mileage);
	}

}

class MotorCycle implements Vehicle{
	int price;
	
	public MotorCycle(int price) {
		this.price = price;
	}

	@Override
	public void showVehicle() {
		System.out.println("MotorCycle: price="+price);
	}
}

public class Test_인터페이스_다형성 {
	
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {
			v.showVehicle();
		}
	}
	
	public static void main(String[] args) {
		Vehicle [] arr = new Vehicle[5]; // 배열 생성(객체 생성X)
		arr[0] = new Truck(33);
		arr[1] = new Car(4);
		arr[2] = new Taxi(2, 9000);
		arr[3] = new Truck(22);
		arr[4] = new MotorCycle(12000);
//		arr[5] = new Vehicle(); vehicle은 인터페이스라 객체를 생성할 수 없음
		displayVehicles(arr);
	}
}
