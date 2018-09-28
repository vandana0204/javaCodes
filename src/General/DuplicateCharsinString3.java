package General;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsinString3 {

	public static void main(String[] args) {
		
		
		String s="vandanayadav";
		 char[] str= s.toCharArray();
		 int count =0;
		 Map<Character,Integer> hm = new HashMap<Character,Integer>();
		 //Set<Character,Integer>set=hm.entrySet();
		 
		 for(char s1:str) {
			 
			 if(hm.containsKey(s1)) {
				 
				 hm.put(s1,hm.get(s1)+1);
			 }
			 else {
				 hm.put(s1, 1);
				 
			 }
			 
			 
		 }
		 
		 //for(char s1:str) {
			 
			 System.out.println(hm);
		 //}
	}

}
