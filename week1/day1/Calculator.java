package week1.day1;

public class Calculator {

	public void add(int a,int b) {
       
		System.out.println(a+b);

	}
	public void sub(int a, float b) {
        System.out.println(a-b);

	}
	public void mul(float a, double b) {
     System.out.println(a*b);

	}
	public void div(float a,int b) {
 
		System.out.println(a/b);

	}
	
	
	public static void main(String[] args) {
		//Create obj 
		Calculator cal=new Calculator();
		cal.add(20, 30);
		cal.sub(23, 2.3f);
		cal.mul(3.0f, 234.4d);
		cal.div(10.5f, 20);

	}

}
