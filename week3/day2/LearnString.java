package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		//As Literal
		String name="Test";
		
		String cmpName="Leaf";
		
		
		
		System.out.println("Company name"+name+cmpName);
		System.out.println(name.concat(cmpName));
		//As instance
		String s=new String ("Testleaf");
		
		System.out.println(name==cmpName);
		
		System.out.println("Before case"+name.equals(cmpName));
		System.out.println(name==s);//reference address
		
		//To find the count or length of the String
		System.out.println(name.length());
		
		int len = name.length();//ctrl+2+l
		System.out.println(len);
		//compare two String values
		System.out.println(name.equals(s));
		//
		System.out.println(name.equalsIgnoreCase(cmpName));
		System.out.println(name.contains("Test"));
		
		
		int []num= {1,2,3,4};
		
		String[] name1= {"priya","vinoth"};
		
		char[] charArray = name.toCharArray();
		
		System.out.println(charArray);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		char charAt = name.charAt(5);
		System.out.println("Index of particular char:"+charAt);
		
		String input="Testleaf located in chennai";
		
		String[] split = input.split(" ");
		for (int i = 0; i < split.length; i++) {
	
		System.out.println(split[i]);
		}
		
		String replace = input.replace('e', 'a');
		System.out.println(replace);
		
		String input1="   Testleaf Located in 7000 by 2009   ";
		
		String replaceAll = input1.replaceAll("[^0-9]","");
		System.out.println(replaceAll);
		
		System.out.println(input1.replaceAll("\\d",""));//only char
		System.out.println(input1.replaceAll("\\D",""));//only digit
		
		System.out.println(input1.substring(2));
		System.out.println(input1.subSequence(19, 24));
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(input1.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
