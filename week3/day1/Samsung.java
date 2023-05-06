package week3.day1;

public class Samsung extends AndroidTV implements Android{

	public void playVideo() {
		System.out.println("Its coming from interface");
		
	}

public static void main(String[] args) {
	 Samsung obj=new  Samsung();
	 obj.playVideo();
	 obj.openApp();
}

	
}
