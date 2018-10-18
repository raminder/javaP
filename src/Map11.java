import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map11 {

    public static void main(
            String[] args) {
        HashMap<Integer,String> mp=new HashMap<Integer,String>();
        HashMap<Integer,String> mp2=new HashMap<Integer, String>(mp);
        HashMap<Integer,String> mp3=new HashMap<Integer, String>(30,0.5f);
        mp.put(1, "UK");
        mp.put(2, "USA");
        mp.put(3, "Canada");
        mp2.put(0, "Australia");
        mp2.put(4, "India");
        mp2.putAll(mp);
        mp2.putIfAbsent(10, "UK");
        System.out.println(mp2.get(3));
        System.out.println(mp2.containsKey(3));
        System.out.println(mp2.containsValue("Pakistan"));
        System.out.println(mp2.size());
        System.out.println(mp2.keySet());
        mp2.clear();
        for(Map.Entry<Integer,String> entry:mp2.entrySet()){
            System.out.println("The key and value is" +" "+entry.getKey()+":"+ entry.getValue());
        }
            Set<Integer> keyset=mp.keySet();
            for(Integer key:keyset){
                System.out.println(key);
                
            }
            Collection<String> valueset=mp.values();
            for(String value:valueset){
                System.out.println(value);
            }
            
        }
}
