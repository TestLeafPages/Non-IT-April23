package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

   Set<Integer> nums=new TreeSet<Integer>();
   //add element in set
   nums.add(10);
   nums.add(30);
   nums.add(50);
   nums.add(20);
   nums.add(40);
   nums.add(50);
   nums.add(20);
   //print the set
   System.out.println(nums);
   //remove the element from set
   System.out.println(nums.remove(50));
   
   System.out.println(nums);
   
   //To check the element present in set or not
   System.out.println(nums.contains(60));
   //To remove all the Element from set
   //nums.clear();
   System.out.println(nums);
   //To check the set is empty
   System.out.println(nums.isEmpty());
   //No index can go with foreach loop
   for (Integer output : nums) {
	System.out.println(output);
}
  

	}

}
