package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class LearnEnabled {
	@Ignore
	@Test(priority = 1 , enabled = false )
	public void createLead() {
		System.out.println("createlead");
	}
	
	@Test()
    public void editLead() {
		System.out.println("editlead");
	}
	
	@Test(enabled = false)
    public void duplicateLead() {
	 System.out.println("duplicatelead");
    }
}
