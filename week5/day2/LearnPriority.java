package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority = 1)
	public void createLead() {
		System.out.println("createlead");
	}
	
	@Test(priority = -1)
    public void editLead() {
		System.out.println("editlead");
	}
	
	@Test
    public void duplicateLead() {
	 System.out.println("duplicatelead");
    }
	
	

}
