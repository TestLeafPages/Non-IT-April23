package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
	    //array declaration
	   	//As a Array Literal 
		int[] values= {90,91,97,88,67};//index 0 to 4 but len 5
		//67 88 90 91 97
		//Instantiation
		int[] nums=new int[4];
		nums[0]=90;
		nums[1]=67;
		nums[2]=56;
		nums[3]=45;
		//find the length of array
		 int length = values.length;   //assign local variable ctrl+2 pop pick sec option
		 System.out.println(length);
		 //print first index
		 System.out.println("First index"+values[0]);
		 //Last index
		 System.out.println("Last Index"+values[length-1]);
		 //sort the array
		 Arrays.sort(values);
		 //second largest num
		 System.out.println("second largest num"+values[length-2]);
		 System.out.println(values[0]);
		 //System.out.println(values[6]);
		 System.out.println(values);
		 for (int i = 0; i <values.length; i++) {
			System.out.println(values[i]);
		}
		 System.out.println("..............................");
		 //reverse order
		 for (int i =values.length-1 ; i >=0; i--) {
				System.out.println(values[i]);
			}
}
}
