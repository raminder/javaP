import java.util.Scanner;

public class Nearest100 {

    static int nearestTo100(int firstNum,int secondNum){
        int diff1=Math.abs(100-firstNum);
        int diff2=Math.abs(100-secondNum);
        if(diff1<diff2){
           return firstNum;
            }
        else if(diff2<diff1){
            return secondNum;
        }
        else
            return firstNum;
        
    }
    public static void main(
            String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first Number");
         int firstNum=sc.nextInt();
         
         System.out.println("Enter second numvber");
         int secondNum=sc.nextInt();
         System.out.println(nearestTo100(firstNum,secondNum));
    }

}
