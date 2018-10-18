import java.util.Arrays;
import java.util.HashSet;

public class CommonArrayElement {
    
    static void findCommonElements(String s1[],String s2[]){
        HashSet<String> has=new HashSet<String>();
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    has.add(s1[i]);
                }
            }
        }
       System.out.println(has);
       }
    
    static void findCommonColl(String s3[],String s4[]){
        HashSet<String> set1=new HashSet<String>(Arrays.asList(s3));
        HashSet<String> set2=new HashSet<String>(Arrays.asList(s4));
        set1.retainAll(set2);
        System.out.println(set1);
        
    }
     

    public static void main(
            String[] args) {
        findCommonElements(new String[]{"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"},
                new String[]{"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"} );
        
        findCommonColl(new String[]{"TEST","JAVA","J2EE"},
                new String[]{"TESTING","TE","JAVA"});
  }

}
