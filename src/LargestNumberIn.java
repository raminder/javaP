import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberIn {

    @SuppressWarnings("null")
    static void largestNumber(int givenNum){
        int[] arr=new int[4];
        int i=0;
        int givenNumR=0;
       while(givenNum !=0){
                givenNumR=givenNum % 10;
                givenNum=givenNum / 10;
                arr[i]=givenNumR;
                System.out.println(arr[i]);
                ++i;
            }
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
          }
        
        
        
 
    
    
    public static void main(
            String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
         int givenNum=sc.nextInt();
largestNumber(givenNum);
    }

}
