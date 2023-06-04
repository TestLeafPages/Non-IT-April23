package week7.day2;

public class LearnConstructor {
	//default 
	public LearnConstructor() {
		
		System.out.println("I am from default Constructor");
	}
	//one parameter
	public LearnConstructor(String name) {
		this();
		System.out.println("one Parameter:"+name);
		
	}
	//Two parameter
	public LearnConstructor(String name, int id) {
		this("Testleaf");
		System.out.println("Two parameter Constructor"+name+id);
	}
		
//Constructor --> special method
//method name=classname
//should not return anything
	int var;
	public void print() {
		System.out.println("simple print");
	}
	
	public static void main(String[] args) {
		//without obj creation we can not execute
		//LearnConstructor()-->calling the constr
		//it gives the refernce of the class
		//new -->create a new memory space in heap memory
		//so,java create a virtual cons to provide the object
		LearnConstructor obj=new LearnConstructor("Testleaf",1001);
		//LearnConstructor obj1 = new LearnConstructor("Testleaf");
		obj.print();
		System.out.println(obj.var);
		
	}
	
}
