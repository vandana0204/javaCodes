package General;


public class ArmStrong {

	public static void main(String[] args) {
		
		int sum=0,a;
		int n= 154;
		int temp=n;
		
		while(n>0) {
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
			
		}
		
		if(temp==sum) {
		
		System.out.println("Its an ArmStrong Number");
		}
		else
			System.out.println("Its NOT an ArmStrong Number");
		
		
		
	}

}
