package General;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

public void findDuplicateChars(String str){
     
    Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
    char[] chrs = str.toCharArray();
    for(Character ch:chrs){
        if(dupMap.containsKey(ch)){
            dupMap.put(ch, dupMap.get(ch)+1);
        } else {
            dupMap.put(ch, 1);
        }
    }
    Set<Character> keys = dupMap.keySet(); //get all the keys in keys variable of the type set (has unique values)
    for(Character ch:keys){
        if(dupMap.get(ch) > 1){
            System.out.println(ch+"--->"+dupMap.get(ch));
        }
    }
}
 
public static void main(String a[]){
    DuplicateCharsInString dcs = new DuplicateCharsInString();
    //dcs.findDuplicateChars("Java2Novice");
    dcs.findDuplicateChars("vandanayadav");
}
}