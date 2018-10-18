
public class SecondLargestArrayNumber {
    
    static int secondLargetNumber(int[] a){
        int firstLargestNo,secondLargestNo;
        if(a[0]>a[1]){
            firstLargestNo=a[0];
            secondLargestNo=a[1];
            }
        else{
            firstLargestNo=a[1];
            secondLargestNo=a[0];
        }
       for(int i=2;i<a.length;i++){
           if(a[i]>firstLargestNo){
               firstLargestNo=a[i];
           }
           else if (a[i]<firstLargestNo && a[i]>secondLargestNo){
               secondLargestNo=a[i];
           }
       }
    return secondLargestNo;
       }

    public static void main(
            String[] args) {
        System.out.println(secondLargetNumber(new int[]{45, 51, 28, 75, 49, 42}));

    }

}
