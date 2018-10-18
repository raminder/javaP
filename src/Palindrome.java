public class Palindrome {
    public static boolean isPalindrome(String word) {
        
        
        String s2="";
        for(int i=word.length()-1;i>0;i--){
            word.charAt(i);
            s2=s2+word.charAt(i);
        }
        if(word.equalsIgnoreCase(s2)){
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}