
public class FindPairsWithSpecificSum {

    static void findPairs(int[] arr,int inputNumber){
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==inputNumber){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+inputNumber);
                }
            }
        }
    }
    public static void main(
            String[] args) {
        findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        
        findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
 
        findPairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);

    }

}
