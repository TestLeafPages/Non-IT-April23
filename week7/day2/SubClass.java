package week7.day2;

public class SubClass extends LearnFinal {
	public void print() {
		System.out.println("Simple print");
	}
	public final void run() {
		System.out.println("Simple run");
	}
	public static void main(String[] args) {
	LearnStatic.companyName();
	System.out.println(LearnStatic.x);
	
	}

}
