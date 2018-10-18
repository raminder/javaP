import java.util.HashSet;

public class FindDuplicateInArray {
    
    static void removeDuplicate(int [] arr){
        HashSet<Integer> has=new HashSet<Integer>();
        for(int a:arr){
            if(!has.add(a)){
                
                System.out.println("Dupicate Element is"+a);
               }
          }
        
       Object[] withoutDuplicates=has.toArray();
       for(int i=0;i<withoutDuplicates.length;i++){
           System.out.println(withoutDuplicates[i]+"\t");
       }
    }
     

    public static void main(
            String[] args) {
        removeDuplicate(new int[]{23,34,89,23,56,34});

    }

}
