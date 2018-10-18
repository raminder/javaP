import java.util.HashMap;

import java.util.Map;

public class Map3 {
    public static void main(String[] args){
        int[] arr={4,4,5,5,6,6,4,6,5,2,0};
        uniqueElement(arr);
        
    }
        
        public static int uniqueElement(int[] array){
       {
        HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>(array.length);
        for(int num:array){
            Integer occ=mp.get(num);
            mp.put(num, occ==null?1:occ+1);
        }
        for(Map.Entry<Integer, Integer> e:mp.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                    }
        }
        
        return -1;
       }
}
}

