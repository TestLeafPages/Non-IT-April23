package week1.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FindOddNum {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if(i%2!=0) {//2==0
				System.out.println(i);
			}
			
		}
		//To find the number is positive
		int num=0;
		if(num>0) {
			System.out.println("Positive");
		}
		else {
		   System.out.println("Negative");
		}

	}

}
