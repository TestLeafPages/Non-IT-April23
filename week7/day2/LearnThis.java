package week7.day2;

public class LearnThis {
	
	int x;
	String name="Testleaf";
	public LearnThis() {
		
	}
	
	public LearnThis(int x) {
		this.x=x;
		
		
	}
	public LearnThis print() {
		System.out.println(this.name);
		
		return this ;
		
	}
	
    public void run() {
	this.print();
	System.out.println("Simple run");
}
	public static void main(String[] args) {
	
		LearnThis obj= new LearnThis(4);
		
		System.out.println(obj.x);
		obj.run();
		

	}

}
