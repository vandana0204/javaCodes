package General;

public class SwapString {

	public static void main(String[] args) {
		
		String s1= "Vandana";
				String s2="Yadav";
				System.out.println("Strings befor swaping :"+s1+ " " +s2);
				
				s1=s1.concat(s2);
				System.out.println(s1);
			
				
				
				s2=s1.substring(0, s1.length()-s2.length());
				
				s1=s1.substring(s2.length(),s1.length());
				
				
				
				System.out.println("String s1 after swaping :"+s1 );
				System.out.println("String s2 after swaping :" +s2);
		
		

	}

}
