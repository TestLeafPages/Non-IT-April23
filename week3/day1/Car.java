package week3.day1;

public class Car extends Vehicle {
	
	public void brand() {
		System.out.println("Car Brand");
	}
	
	public static void main(String[] args) {
		
		Car obj=new Car();
		obj.soundHorn();
		obj.applyBrake();
		obj.brand();
	}
	
	
	
	
}
