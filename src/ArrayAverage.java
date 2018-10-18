
public class ArrayAverage {

    public static void main(
            String[] args) {
        int arr[][]={{2,3,5},{1,2,3},{5,6,7}};
        int n=arr.length;
        int sum=0;
        int avg = 0;
        for(int i=0;i<n;i++){
       for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
                avg=sum/n;
                  }
        }
        System.out.println(sum);
        System.out.println(avg);
        
        
}
}

