package General;

public class RemoveVovels {

	public static void main(String[] args) {
		
		String  s = "Deepak Patel is doing good";
		RemoveVowel(s);

	}
	
	public static void RemoveVowel(String str) {
		
		 String str1 = str.replaceAll("[aeiouAEIOU]", "");
		 System.out.println(str);
		 System.out.println("New String without vowel is:====>"+str1);
		 	
		}
		
	}

	
	

