
public class LargestNumber {

    static int getLessThanN(int number,int digit){
        char c= Integer.toString(digit).charAt(0);
        System.out.println(c);
        for(int i=number; i>0; --i){
            if(Integer.toString(i).indexOf(c)==-1){
                return i;
            }            
        }
        return -1;

    }
    public static void main(
            String[] args) {
        System.out.println(getLessThanN(123,2));

    }

}
