package General;

public class Stringuplo {

	public static void main(String[] args) {
		
		//String S1 = "VandanaYadav";
		String S1 = "My name is Harry";
		
		for(int i =0;i<S1.length();i++) {
			int ch = S1.charAt(i);
			//handling the first character
			if(i==0) {
					   if(ch>96 &&ch<123) {
								ch=ch-32;
								System.out.print( (char)ch);
					   		}
					   System.out.print( (char)ch);
					   
				   }
			
			//handling other chars in the string
			else if(i!=0)
			if( i%2 != 0) {  //check if its odd
				
				 if(ch>64 &&ch<91 ) {
	
					ch=ch+32;}
				
				System.out.print( (char)ch);}
			else if(i%2 == 0)    {
					
						 if(ch>64 &&ch<91) {
							 ch=ch+32;
				
					System.out.print( (char)ch); }
						 else if(ch>96 &&ch<123)
						 {
							 ch=ch-32;
							 System.out.print( (char)ch);
						 }
						}
			}
		}
		
	}


