package General;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int [] arr= {2,4,6,7,9,10,32,41};
			
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}

}
