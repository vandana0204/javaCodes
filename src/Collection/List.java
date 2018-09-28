package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List {

	public static void main(String[] args) {
		

			ArrayList<Integer> values = new ArrayList();
			
			values.add(404);
			values.add(859);
			values.add(346);
			values.add(258);
			
//			Comparator<Integer> c= new Comparator<Integer>()    //Annononymus class
//					{
//						public int compare(Integer i,Integer j) {
//						if(i%10>j%10)
//							return -1;
//						else
//							return 1;
//						}
//				
//					};
			
			
			
			Comparator<Integer> c= (i,j) -> i%10>j%10?1:-1 ;    //Annononymus with Lambda expression
					
			Collections.sort(values, c);//here we have to pass list and object of comparator
			
			
			//Collections.sort(values);
			
			
			for(Integer e : values)
				System.out.print(" :"+e);
			
//			Collections.reverse(values);
//			
//			for(Integer e : values)
//				System.out.print(" :"+e);
			
			//now if i want to sort the collection objects by its last digit
			
			
			
			
			
			
			
	}
	
	

}
