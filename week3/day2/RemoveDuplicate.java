package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input="Testleaf";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> output=new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			output.add(charArray[i]);
		}
		System.out.println(output);

	}

}
