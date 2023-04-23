package week1.day2;

public class LearnOperator {

	public static void main(String[] args) {
		//Arithmetic operator
		System.out.println(2+2);
		System.out.println(2-2);
		System.out.println(2*2);
		System.out.println(2/2);
		System.out.println(2%2);
		//Comparison operator
		System.out.println(2==2);
		System.out.println(2<2);
		System.out.println(2<=2);
		System.out.println(2!=2);
		System.out.println(2>3);
		System.out.println(2>=3);
		//unary operator
		int a=5;
		System.out.println(a++);//5+1
		System.out.println(a);//6
		System.out.println(++a);//7
		//Decrement
		System.out.println(a--);//7
		System.out.println(a);//6
		System.out.println(--a);//5
		//Logical
		int b=5;
		System.out.println((a==b)&&(a<=b));
		System.out.println((a==b)||(a<b));
		System.out.println(a!=b);//5==5
		boolean flag=false;
		System.out.println("boolean Result:"+!flag);
		//Assignment operator
		int c=10;
		

	}

}
