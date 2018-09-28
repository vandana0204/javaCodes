package General;

import java.lang.reflect.Array;

public class countoccurance {

	public static void main(String[] args) {
		
		int[] a= {1,3,5,2,2,3,5 };
		
		int count=0;
		int n=a.length;
		  // System.out.println("\n");
		
		 for(int i=0;i<n;i++) {
			 
				 for(int j=i+1;j<=n-1;j++) {
					 
						 if(a[i]==a[j] && a[i]!='\0') {
							  count= count+1;
							  a[j] = '\0';
							  
							}
						 			}	 
				
				 	if(a[i]!='\0')
		            {
		                System.out.println(a[i] + " is " + count + " times.\n");
		            }
				 	 
		 }
	
	}

}
