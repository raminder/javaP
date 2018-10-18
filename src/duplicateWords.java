import java.util.HashMap;
import java.util.Set;
public class duplicateWords {

    static void duplicateWordsS(String s){
        String[] words=s.split(" ");
        HashMap<String,Integer> mp=new HashMap<String,Integer>();
        for(String s1:words){
            if(mp.containsKey(s1.toLowerCase())){
                mp.put(s1.toLowerCase(), mp.get(s1.toLowerCase())+1);
                }
            else{
                mp.put(s1.toLowerCase(), 1);
            }
        }
        
        Set<String> words1 = mp.keySet();
        for(String s2:words1){
            if(mp.get(s2)>1){
                System.out.println(s2+":"+mp.get(s2));
            }
            
        }
    }
    
    static void numeberOfWords(String s){
        String[] words=s.split(" ");
        System.out.println("Total word count" +" "+words.length);
    }
    public static void main(
            String[] args) {
        duplicateWordsS("Bread is butter butter is bread");
        duplicateWordsS("Java is java again java");
        numeberOfWords("Java is java again java");
    }

}
