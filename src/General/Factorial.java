package General;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();

		
		if(n>=0) {
			
			while(n!=0) {
				
				f= f*n;
				n-- ;
			}
			
			System.out.println("Factorial of given number is:: "+f);
		}
	
	
	else {
		System.out.println("!!Enter a valid input!!");}
		
  }
}	
	
