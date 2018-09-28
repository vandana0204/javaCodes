package General;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6,7,8,9};
		
		int n = arr.length;
		
	System.out.println("length of array is :"+n);
		int sum = 0;
		n=n+1;
		sum= n*(n+1)/2;
		System.out.println("Sum:"+sum);
		int ActualSum=0;
		int MissingNumber = 0;
		n = arr.length;
		
		
		for(int i=0;i<=n-1;i++) 
			
			ActualSum= ActualSum+arr[i];
		
		MissingNumber =sum-ActualSum;
		System.out.println("The missing number is :"+MissingNumber);
		
		

	}

}
