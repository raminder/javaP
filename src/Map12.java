import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map12 {

    public static void main(
            String[] args) {
        HashMap<Integer,String> mp=new HashMap<Integer,String>();
        mp.put(1, "UK");
        mp.put(2, "USA");
        mp.put(3, "Canada");
        mp.put(0, "Australia");
        mp.put(4, "India");
        System.out.println("Hash Map before replace:");
        for(Map.Entry<Integer,String> entry:mp.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
        mp.replace(0, "Australia", "Pakistan");
        System.out.println("Hash map after replace");
        for(Map.Entry<Integer, String> entry:mp.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
          
        }
}}
