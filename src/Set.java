import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class Set {

    public static void main(
            String[] args) {
        SortedSet<String> st=new TreeSet<String>();
        SortedSet<String> stn=new TreeSet<String>();
        LinkedHashSet<String> names = new LinkedHashSet <String>( ) ;
        names.add("test");
        names.add("fest");
        names.add("gest");
        names.add("nest");
        names.add("qest"); 
        st.add("G");
        st.add("F");
        st.add("A");
        st.add("R");
        st.add("Q");
        st.add("N");
        stn=st.tailSet("F");
        
       Iterator<String> itr=stn.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       
       Iterator<String> ltr=names.iterator();
       while(ltr.hasNext())
       {
         System.out.println(ltr.next());  
       }
       
    }

}
