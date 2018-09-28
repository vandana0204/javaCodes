package General;

public class isPrime {
	
	public  static void checkPrime(int num) {
		
		boolean isPrime=true;
		for(int i =2;i<num;i++) {
			
			if(num%2==0) {
				isPrime= false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("The given number:"+ num +" is prime");
		}

		else {
			System.out.println("The given number :"+num +"is NOT prime");
		
		}
	}
	
	public static void main(String[] args) {
		
//		int arr[] = {6, 10, 5, 4, 9, 120, 35, 40, 25};
//        int n = arr.length;
		isPrime obj= new isPrime();
		obj.checkPrime(45);
		
		
		
		
		
		}
	

}

