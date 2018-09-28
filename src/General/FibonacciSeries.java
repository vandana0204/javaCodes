package General;

public class FibonacciSeries {

	public static void main(String[] args) {
		/* a=0 and b=1;
		 * sum=a+b;
		 * 
		 * 
		 * 
		 * */
		int a=0,b=1,sum=0;
		System.out.print(a +"\n"+b +"\n");
		
		for(int i=1;i<=10;i++) {
			
			sum=a+b;
			System.out.println(+sum);
			 a=b;
			 b=sum;
			}
		
		
		
		
		
		
		
		

	}

}
