import java.util.Scanner;

public class wordsCount {

    public static void main(
            String[] args) {
        String s1="java concept of the day";
        String[] word=s1.split(" ");
        String s3="";
        for(int i=0;i<word.length;i++){
            String s4=word[i];
            String wordr="";
           for(int j=s4.length()-1;j>=0;j--){
                   wordr=wordr+s4.charAt(j);
           }
                   s3=s3+wordr+" ";
                   
        }
        System.out.println(s1);
        System.out.println(s3);
    }

}

