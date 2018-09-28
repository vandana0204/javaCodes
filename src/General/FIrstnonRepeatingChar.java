package General;

import java.util.HashMap;
import java.util.Map;

public class FIrstnonRepeatingChar {

	public static void main(String[] args) {
		
		String s= "aabbbcdddeff";
		
		String [] str= s.split("");
		//int count=0;
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0;i<str.length;i++) 
		{
			if(hm.containsKey(str[i])) 
			{
				hm.put(str[i], hm.get(str[i])+1);
			}
			else 
			{
				hm.put(str[i], 1);
			}
			
		}
		for(int i=0;i<str.length;i++) 
		{
			if(hm.get(str[i])==1) {
				
				System.out.println("The first non repeating character n the given string is::" +str[i]);
				break;
			}
			
		}

	}

}
