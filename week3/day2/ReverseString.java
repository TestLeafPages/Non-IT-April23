package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Reverse the String
==================
String  input=“TestLeaf";

Goal: To understand the String, loop

a)Convert the String to character array (use toCharArray)
b)Use forloop to iterate to each character (from end to go the first)
c)Print the Characters continuously
*Hint  Use as system.out.print() 

		 */
		
		 String  input="TestLeaf";
		 
		 char[] ch = input.toCharArray();
		 
		 for (int i = ch.length-1; i >=0; i--) {
			 
			 System.out.print(ch[i]);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
