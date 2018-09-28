package General;

public class CommonElementinArray {

	public static void main(String[] args) {
		int[] arr1= {4,6,7,3,9};
		int[] arr2= {6,2,3,9,7,10,13};
		int n2 = arr2.length;
		int n1 =arr1.length;
		
		for(int i=0;i< n2-1;i++) {
			
			for(int j=0;j<=n1-1;j++) {
			
			if(arr1[i]==arr2[j]) {
				System.out.println(arr2[j]);
				
				
				}
			}
			
		}
		
		

	}

}
