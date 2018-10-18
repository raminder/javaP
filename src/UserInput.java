import java.util.ArrayList;
public class UserInput {
    
    public static class TextInput {
        ArrayList<Character> list = new ArrayList<Character>();

    public void add(char c)
    {
        list.add(c);
    }

    public String getValue()
    {
        String r = "";
        for(char c: list)
        {
            r = r + c;
        }
        return r;
    }
    }

    public static class NumericInput extends TextInput{
    @Override
    public void add(char c)
    {
        if (c < '0' || c > '9') 
        { 
        }
        else{
            list.add(c);
        }
    }  
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}