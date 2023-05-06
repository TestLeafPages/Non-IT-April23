package week3.day1;

public class HDFC extends Banker implements RBI {

	public boolean submitKYC() {
		System.out.println("KYC is verified");
		//super.submitKYC();
		return false;
	}
 public void createAccount() {
	 System.out.println("3 days ");
 }
	
public static void main(String[] args) {
	
	HDFC bank=new HDFC();
	bank.createAccount();
	bank.submitKYC();
	bank.loan();
	System.out.println(minimumBalance);
}
@Override
public void loan() {
	System.out.println("edu loan");	
}
}
