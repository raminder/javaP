public class JaggedArray
{
    int i;

    public static void main(String[] args)
    {
        //declaring and creating An array object of A-type containing 8 references to A-type objects
 
       // int[][] jaggedarr= new int[5][];  
        int[] onearr={2,3};
        int[] twoarr={4,5,6};
        int[] threearr={7,8,9,3};
        int[][] jaggedarr={onearr, twoarr, threearr};
        for(int i=0;i<jaggedarr.length;i++){
            for(int j=0;j<jaggedarr[i].length;j++){
                System.out.println(jaggedarr[i][j]+"\t");
            }
            System.out.println();
        }
 
       
    }
    }
