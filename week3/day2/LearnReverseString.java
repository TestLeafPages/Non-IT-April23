package week3.day2;

public class LearnReverseString {

	public static void main(String[] args) {
		/*
		 * Reverse the String
==================
String  input=“Amazon development centre, Chennai"; 
Output = chennai,centre development amazon
Goal: To understand the String, loop
a)Convert the string to lower case
b)split the sentence with white space 
c)Use forloop to iterate (from end to go the first)
c)Print the  reversed String
*Hint  Use as system.out.print() 

		 */
		String  input="Amazon development centre, Chennai"; 
		String lowerCase = input.toLowerCase();//a)Convert the string to lower case
		String replace = lowerCase.replace(",", " ");
		//b)split the sentence with white space 
		String[] word = replace.split(" ");
		
		//c)Use for loop to iterate (from end to go the first)
		for (int i =word.length-1 ; i>=0; i--) {
			System.out.print(word[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
