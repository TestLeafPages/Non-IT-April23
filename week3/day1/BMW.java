package week3.day1;

public class BMW  extends Car{
	
	public void applyBrake() {
		System.out.println("brake from BMW class");
	
		
	}
	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.applyBrake();
	}
}
