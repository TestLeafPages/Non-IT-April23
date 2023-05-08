package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		//input
		String input="google";
		//declare the variable output
		String output="";
		//Convert into char[]
		char[] charArray = input.toCharArray();//ctrl+2
		
		Set<Character> unique=new LinkedHashSet<Character>();
		//use for loop to add the element
		for (int i = 0; i < charArray.length; i++) {
			
			if (unique.add(charArray[i])) {
				//Assign variable to store the result
				output=output+charArray[i];
			}
		}
          System.out.println(output);
	}

}
