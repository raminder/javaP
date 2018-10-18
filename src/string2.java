
public class string2 {

    public static void main(
            String[] args) {
        String s= "afaaggg";
        String t= "";
        String s1="";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                ++count;
                s1=s1+s.charAt(i)+count;
                }
            else
            {
                t= t+ s.charAt(i)+count;
            }
            System.out.println(s1.concat(t));
            //System.out.println(s1);
            //System.out.println(t);
            
        }
    }
    }