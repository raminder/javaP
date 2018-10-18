import java.util.Arrays;
import java.util.Scanner;

public class AltTab3
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of open tabs");
        int n=sc.nextInt();
        System.out.println("Enter no of times user press AltTab");
        int k=sc.nextInt();
        AltTab3 alt=new AltTab3();
        int[] BeforeMove=alt.tabsOpen(n);
        String afterMove=alt.moveTabs(n,k,BeforeMove);
        System.out.println(afterMove);
        }  
    
   public int[] tabsOpen(int n){
                    int[] arr = new int[n];
                for(int i=n;i>0;i--){
                arr[i-1]=n;
                n--;
            }
                return arr;
               }  
 
     public String moveTabs(int n,int k,int array[]){
    int temp;
    int temp1;
    temp=array[0];
    array[0]=array[k-1];
    for(int i=1;i<=k-1;i++){
        temp1=array[i];
        array[i]=temp;
       temp=temp1;
        }
     return Arrays.toString(array);
     
     }
     }


    

