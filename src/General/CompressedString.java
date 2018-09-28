package General;

public class CompressedString {

	public static void main(String[] args) {
		
     String s=  "aaabbbcddcff";
     char[] str=s.toCharArray();
     int count=0;
     boolean flag=false;
     for(int i=0;i<str.length-1;i=i+count) {
    	     count=0;
    	     flag= false;
    	 for(int j=0;j<str.length-1;j++) {
    		 
    		 if(str[i]==str[j]) {
    			 
    			 count++;
    			 flag=true;
    			
    			 }
    		 }
    	 if(flag==true) {
    		 
    	 System.out.print(str[i]);
    	 System.out.print(count);
    	 
    	 }
     }
		
	}

}
