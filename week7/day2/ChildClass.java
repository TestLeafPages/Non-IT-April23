package week7.day2;

public class ChildClass extends ParentClass{
String brandName ="suv";
public ChildClass() {
	super();
	System.out.println("Child constructor ");
}
public void audioSys() {
	super.audioSys();
	System.out.println(super.brandName);
	System.out.println("Child audiosys");
}
public static void main(String[] args) {
	ChildClass obj=new ChildClass();
	obj.audioSys();
   System.out.println(obj.brandName);

	
}
}
