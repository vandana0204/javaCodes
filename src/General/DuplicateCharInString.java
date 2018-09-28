package General;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
	
	
	public  void  findDuplicate(String s) {
		//Section1
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character chr: ch) {
			
			if(hm.containsKey(chr)) {
				
				hm.put(chr, hm.get(chr)+1);
				
			}
			else {
				hm.put(chr, 1);
			}
		}
		
		//section2
		Set<Character> keys = hm.keySet();
		for(Character chr:keys) {
			if(hm.get(chr)>1)
				System.out.println(chr+ "===>"+hm.get(chr));
		}
		
	}

	public static void main(String[] args) {
		//Section3
		DuplicateCharInString obj= new DuplicateCharInString ();
		//obj.findDuplicate("vandanayadav");
		obj.findDuplicate("iamagoodgirl");
		
	}

}
