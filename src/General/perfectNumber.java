package General;

/*A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself. Equivalently, a perfect number
is a number that is half the sum of all of its positive divisors.
The first perfect number is 6, because 1, 2 and 3 are its proper
positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6
is equal to half the sum of all its positive divisors:
		( 1 + 2 + 3 + 6 ) / 2 = 6.*/

public class perfectNumber {

	public static void main(String[] args) {
		
		int i, n=28, sum=0;
		
		
		for(i=1;i<n;i++) 
		{
			
				if(n%i==0) 
				{
					
					sum=sum+i;
					System.out.println(+sum);
					
				}
		}
		if(sum==n) 
		{
			
			System.out.println("The given number is perfect number");
		}
		

	}

}
