package week1.day1;

public class Car {
	int speed=60;//Gobal variable
	
	private void soundHorn() {
      int speed=30;//Local variable
		System.out.println("Sound Horn");

	}
	
	public void applyBrake() {
		System.out.println("Apply brake");

	}
	void brand() {
		System.out.println("kia");
	}
	
	public static void main(String[] args) {
		String name="Testleaf";//Local variable
		//Create object for class
		Car obj =new Car();
		obj.applyBrake();
		obj.soundHorn();
		obj.brand();
		
		System.out.println("Welcome To TestLeaf");
	}
	
	
	}

