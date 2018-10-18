import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharOccr {
    
    static void charOccurence(String inputString){
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        char[] arr=inputString.toCharArray();
        for(char c:arr){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
               }
            else{
               mp.put(c, 1) ;
            }
        }
      Set<Character> st= mp.keySet();
      System.out.println("Duplicate chacrters in" +inputString);
      for(Character ch:st){
          if(mp.get(ch)>1){
          System.out.println(ch+" "+mp.get(ch));
      }
    }
        
    }

    public static void main(
            String[] args) {
        charOccurence("javaj2ee");
        charOccurence("freshfish");

    }

}
