import java.util.Arrays;
import java.util.Scanner;

public class AltTab
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of open tabs");
        int n=sc.nextInt();
        System.out.println("Enter no of times user press AltTab");
        int k=sc.nextInt();
        String BeforeMove=tabsOpen(n);
       System.out.println(BeforeMove);
        String afterMove=moveTabs(n,k,BeforeMove);
        System.out.println(afterMove);
        }  
    
   static String tabsOpen(int n){
                    int[] arr = new int[n];
                for(int i=n;i>0;i--){
                arr[i-1]=n;
                n--;
            }
                
            return  Arrays.toString(arr);
               }  
 
     static String moveTabs(int n,int k,String array){
    char temp,temp1;
    String arr=array.replace("[", "").trim().replaceAll(", ","").trim().replaceAll("\\]","").trim();
    char[] arr1=arr.toCharArray();
    System.out.println(arr1.length);
    temp=arr1[0];
    arr1[0]=arr1[k-1];
    for(int i=1;i<=k-1;i++){
        temp1=arr1[i];
        arr1[i]=temp;
       temp=temp1;
        }
    System.out.println(arr1);
    return Arrays.toString(arr1);

   }
}
    

