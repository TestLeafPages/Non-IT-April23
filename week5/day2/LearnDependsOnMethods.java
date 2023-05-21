package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnDependsOnMethods {
	
	
	@Test()
	public void createLead() throws InterruptedException {
		System.out.println("createlead");
		throw new RuntimeException();
		
	}
	
	@Test(dependsOnMethods ={"week5.day1.CreateLead.runCreateLead","createLead","duplicateLead"}
	,alwaysRun = true )
    public void editLead() {
		System.out.println("editlead");
	}
	
	@Test()
    public void duplicateLead() {
	 System.out.println("duplicatelead");
    }

}
