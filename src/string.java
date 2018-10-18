
public class string {

    public static void main(
            String[] args) {
        String s= "madam";
        String t= "";
        for(int i=s.length()-1; i>=0; i--){
            t= t+ s.charAt(i);
        }
        System.out.println(t);
        System.out.println(s);
       if(s.equals(t)){
           System.out.println("The string is palindrome");
       }
       else
           System.out.println("The string is not palindrome");
        
}

}
