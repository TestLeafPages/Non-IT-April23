package week3.day1;

public class Calculator {

	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void add(float x,int y) {
		System.out.println(x+y);
	}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public void sub(float x,float y) {
		System.out.println(x-y);
	}
	public void sub(float x,float y,float z) {
		System.out.println(x-y-z);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(0.3f, 20);
		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.sub(1.5f, 2.5f);
		cal.sub(0.5f, 2.5f, 5.3f);
	}

}
