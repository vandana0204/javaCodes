package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashmap {

	public static void main(String[] args) {
		
			Map<String,Integer> hm= new HashMap<String,Integer>();
			
			hm.put("QTP",97);
			hm.put("Java",40);
			hm.put("c#",25);
			hm.put("unix",34);
			hm.put("Mac",20);
			hm.put("javato novoice",12);
			
			Set<Entry<String,Integer>> set= hm.entrySet();
			ArrayList<Entry<String,Integer>> list= new ArrayList<Entry<String,Integer>>(set);
			
			Collections.sort(list, new Comparator<Entry<String,Integer>>()
					{
						public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2)
						{
							//return (o2.getValue().compareTo(o1.getValue()));
							return o1.getValue()-o2.getValue();
						}
				
					}	);
			
			for(Map.Entry<String, Integer> entry:list) {
				System.out.println("Key:"+entry.getKey()+"==>" +"Value:" +entry.getValue());
			}
	}

}
