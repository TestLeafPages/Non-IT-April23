package week1.day2;

public class FindDuplicateArray {

	public static void main(String[] args) {
		//input
		int arr[]= {14,12,13,14,12,16,17};
		
		for (int i = 0; i <arr.length; i++) {//14
			 
			for (int j = i+1; j < arr.length; j++) {//12
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);//14
				}
				
			}
		}

	}

}
