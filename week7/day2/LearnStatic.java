package week7.day2;

public class LearnStatic {
	
	static int x;
	 String name;
	 
		
		  static { 
			  System.out.println("I am inside static block"); }
		 
	
	
	public static  void companyName() {
		 int x;
		String name="Testlaef";
		System.out.println(name);
	}
	public void empName() {
		int x;
		String name="Princila";
	}
	
	public static void main(String[] args) {
		int y = 10 ;
		String colour;
		LearnStatic obj=new LearnStatic();
		System.out.println(y);
		System.out.println(x);
		System.out.println(obj.name);
		companyName();
		obj.empName();

	}

}
