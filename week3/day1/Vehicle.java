package week3.day1;

public class Vehicle {

	public void soundHorn() {
		System.out.println("Vehicle");
	}
	
	public void applyBrake() {
		System.out.println("brake from Vehicle class");
	}
	public static void main(String[] args) {
		Vehicle veh=new Vehicle();
		veh.applyBrake();
		veh.soundHorn();
	}
}
