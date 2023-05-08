package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	
		List <String> names=new ArrayList <String>();
		//add element in list
		names.add("Prasanna");
		names.add("Sankar");
		names.add("Ramya");
		names.add("Ayisha");
		names.add("pramila");
		names.add("Ayisha");
		names.add("Ramya");
		
		//print the List
		System.out.println(names);
		//remove the element from list
		names.remove(6);
		System.out.println(names);
		//length of my list
		System.out.println(names.size());
		//Iterate for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		//get the particular index
		System.out.println(names.get(4));
		//add element again
		System.out.println(names.add("Janani"));
		System.out.println(names);
		//convert list into array
		Object[] array = names.toArray();
		
		System.out.println(names.contains("Ayisha"));
		//To sort (arrange the element in order)
		Collections.sort(names);
		System.out.println(names);

	}

}
