package General;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DUplicatesCharinString {

	public  void  finddup(String s) {
	//1 Section
	char[] ch =s.toCharArray();
	Map<Character ,Integer> hm = new HashMap<Character,Integer>();
	
	for(Character cha :ch ) {
		
		if(hm.containsKey(cha)) {
			
			hm.put(cha, hm.get(cha)+1);
			
		}
		else {
			hm.put(cha, 1);
			
		}
	}

	//2 Section
	
	     Set<Character> keys=hm.keySet();
	     
	     for(Character cha:keys) {
	    	 
	    	 if(hm.get(cha)>1)
	    		 System.out.println("Character" + "::"+cha  +"  repeates"+"==========>"+hm.get(cha));
	    		 
	    	 
	    
	     }
	
	
	}
	//3 rd Section:
	
	public static void main(String[] args) {
		
		DUplicatesCharinString obj = new DUplicatesCharinString();
		obj.finddup("vandanayadavRashmi");
		


	}

}
