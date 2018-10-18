import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("test");
        al.add(0, "Rahul");
        al.add("test");
        al.add("test1");
        al.add("test2");
        al.add("test3");
        al.size();
        //al.remove(1);
        al.size();
        System.out.println(al);
       System.out.println(al.subList(0, 1));
       LinkedList<String> ll=new LinkedList<String>();
       ll.addAll(al);
       System.out.println(ll.getFirst());
       ll.getLast();
       ll.pollFirst();
       ll.peek();
       ListIterator<String> itr=al.listIterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       ListIterator<String> itr1=ll.listIterator();
       while(itr1.hasNext()){
           System.out.println("Linked list is" +itr1.next());
       }
}
}
