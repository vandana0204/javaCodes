package General;

public class FibonacciSeries4 {

	public static void main(String[] args) {
		
		int a=0;
		int i =0;
		int b=1;
		int c= 0;
		
		System.out.print(a+" "+b);
		
		for(i=0;i<=9;i++) 
		{
				c=a+b;
			System.out.print(" "+c );
			
				a=b;
				b=c;
		}
		
		 
		
	}

}
