package General;

import java.util.Arrays;

public class CheckAnangram {
	
	public boolean Anangram(String s1,String s2) {
		
		//Before converting to any array  check what can happen on strings
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		//step#1 conver to char array and sort it using Arrays.sort function
		char [] arr1= s1.toCharArray();
		Arrays.sort(arr1);
		char [] arr2= s2.toCharArray();
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
	}

	public static void main(String[] args) {
		CheckAnangram ana=new CheckAnangram();
		//System.out.println(ana.Anangram("Leader", "dealer"));
		System.out.println(ana.Anangram("break", "baker"));
		
		


	}

}
