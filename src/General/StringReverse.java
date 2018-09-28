package General;

public class StringReverse {

	public static void main(String[] args) {
		
		String  s=  "VANDANA";
		System.out.println(s.length());
		for(int i =(s.length())-1;i>=0;i--)
		System.out.println(s.charAt(i));
		
//		char arr[]= s.toCharArray();
//		//System.out.println(arr.length);
//		int len =(arr.length)-1;
//		
//		for(int j=len; j>=0;j--) {
//		
//			System.out.print(arr[j]);
//			
//		}
//		
//		//2 way
//		
//		StringBuffer buff = new StringBuffer();
//		System.out.println(buff.reverse());

	}

}
