public class Test
{
    int i = 10;
    int j=4;
    int k=8;
 
    static int t;
 
    public static void main(String[] args)
    {
        Test to=new Test();
        System.out.println(Test.t);
        System.out.println(to);
        
    }
    
    @Override
    public String toString(){
        return "i="+i+"\n"+"j="+j+"\n"
                +"k="+k;
        
    }
}