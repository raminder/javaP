
public class String11 {

        public static void main(String[] args) {
        String s1="PHP Exercises and New";
        String s2="New";
        StringBuffer str=new StringBuffer();
        char[] arr={'a','c','f','d'};
       String[] str1=s1.split(" ");
      for(String s:str1){
          if(s.equals(s2)){
              System.out.println(s);
          }
          else{
              System.out.println("No match");
          }
              
      }
        }
}
        
        


