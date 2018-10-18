public class ArraysInJava
{
    public static void main(String[] args)
    {
        String[][][][] colors =
            {
                {
                    {
                        {"RED", "GREEN", "BLUE"},
 
                        {"GREEN", "RED", "BLUE"}
                    },
                    {
                        {"ORANGE", "GREEN", "WHITE"},
 
                        {"BLACK", "INDIGO", "BLUE"}
                    }
                },
                {
                    {
                        {"SKY BLUE", "ALMOND", "AQUA"},
 
                        {"APPLE GREEN", "PINK", "BLUE GREEN"}
                    },
                    {
                        {"VIOLET", "BRASS", "GREY"},
 
                        {"BROWN", "INDIGO", "CHERRY"}
                    }
                }
            };
 
        System.out.println(colors[1][0][1][0]);
 
        System.out.println(colors[0][1][0][1]);
 
        System.out.println(colors[0][0][0][2]);
 
        System.out.println(colors[1][1][1][2]);
 
        System.out.println(colors[0][0][0][0]);
 
        System.out.println(colors[1][1][1][1]);
    }
}