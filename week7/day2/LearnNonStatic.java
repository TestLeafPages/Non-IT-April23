package week7.day2;

public class LearnNonStatic {

	static {
		System.out.println("execute static block");
	}
	
	{
		System.out.println("Execute NonStatic block");
	}
	public LearnNonStatic() {
		System.out.println("I am the constructor  block");
	}
	
	public static void main(String[] args) {
		LearnNonStatic obj=new LearnNonStatic();
	}
}
