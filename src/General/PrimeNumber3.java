package General;

public class PrimeNumber3 {

	public static void main(String[] args) {
		//Display prime number between 1 to 100
		
		
		int i,j;
		int n=100;
		boolean flag =true;
		
		for(i=1;i<100;i++) {
			
			for(j=2;j<i-1;j++)
			{
			 flag =true;
				
				if(i%j==0) 
				{
					//not a prime number
					flag=false;
					break;
				}
			}
			
			if(flag ==true) 
				System.out.print(+i+ ",");
			
		}
		
		
		
		
	}

}
