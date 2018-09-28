package General;

public class StringLength {

	public static void main(String[] args) {
	
		String s= "vandanayadav";
		int i=0;
		int count=0;
		char[] arr= s.toCharArray();
		

		for(char ch:arr) {
			
			count++;
		}
		
		System.out.println("Length of string is :"+count);
	}

}
