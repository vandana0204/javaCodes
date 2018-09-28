package General;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anangram {

	public static void main(String[] args) {
		// Anagram
		//leader dealer
		
		String s1= "leader";
		char[] str1=s1.toCharArray(); 
		String s2= "dealer";
		char[] str2=s2.toCharArray();
		boolean status =false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		System.out.println(str1);
		System.out.println(str2);
		
		status=Arrays.equals(str1,str2) ;
		if(status)
	
			System.out.println("The strings are Anangram");
		
		
		
//		for(int i=0;i<str2.length;i++) {
//			
//			if(str1[i]==str2[i]) {
//				System.out.println(str1[i]);
//				
//				
//			}
//			
//		}
		
		
		

	}

}
