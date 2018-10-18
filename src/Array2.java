public class Array2
{
    int i;

    public static void main(String[] args)
    {
        //declaring and creating An array object of A-type containing 8 references to A-type objects
 
        Array2[] a = new Array2[8];   
 
        a[2] = new Array2();   //creating A-type object and assigning it to element at index 2
 
        a[5] = new Array2();   //creating A-type object and assigning it to element at index 5
 
        a[2].i = 10;     //Changing value of field of A-type object referred by element at index 2
 
        a[5].i = 20;     //Changing value of field of A-type object referred by element at index 5
 
        methodOne(a);   //Passing array to methodOne()
 
        //Changes made to array object in the method are reflected here
 
        System.out.println(a[2].i);     //Output : 30
 
        System.out.println(a[5].i);     //Output : 40
    }
 
    static void methodOne(Array2[] a)
    {
        a[2].i = 30;   //Changing value of field of A-type object referred by element at index 2
 
        a[5].i = 40;   //Changing value of field of A-type object referred by element at index 5
    }
    }
