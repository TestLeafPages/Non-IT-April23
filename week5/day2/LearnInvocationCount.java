package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	
	@Test(invocationCount = 2,invocationTimeOut = 1000,threadPoolSize = 2 )
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("createlead");
	}
	
	@Test(invocationCount = 3)
    public void editLead() {
		System.out.println("editlead");
	}
	
	@Test()
    public void duplicateLead() {
	 System.out.println("duplicatelead");
    }
}
