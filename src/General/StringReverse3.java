package General;

public class StringReverse3 {

	public static void main(String[] args) {
		
		String s = "vandana";
		
		String [] str = s.split("");
		int i=0;
		int n=str.length;
		//System.out.println(n);
		
		for(i=n-1;i>=0;i--) {
			
			System.out.print(str[i]);
			System.out.print(" ");
		}
		
		
		
	}

}
