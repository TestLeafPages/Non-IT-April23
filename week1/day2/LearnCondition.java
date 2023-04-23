package week1.day2;

public class LearnCondition {

	public static void main(String[] args) {
	
		int age=35;
		
		if(age>=18) {
			System.out.println("Your Eligible for vote");
		}
		else {
			System.out.println("Your Not Eligible");
		}
		
		
		int mark=80;
		if(mark==35) {
			System.out.println("pass");
		}
		else if((mark<=50)||(mark<=60)) {
			System.out.println("Grade E");
		}
		else if(mark<=70||mark<=80) {
			System.out.println("Grade C");
		}
		else if(mark<=99) {
			System.out.println("Grade O");
		}
		else {
			System.out.println("fail");
		}
		
		for (int i = 0; i <=5; i++) {
				
			//System.out.println(i);
			if(i==3) {
				//break;//terminate the loop
				continue;//skip the particular condition
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
