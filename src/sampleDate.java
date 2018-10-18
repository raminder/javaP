import java.text.SimpleDateFormat;
import java.util.Date;

public class sampleDate {

    public static void main(
            String[] args) {
        Date d=new Date();
        SimpleDateFormat formatD=new SimpleDateFormat("dd MMMM yyyy zzzz");
        System.out.println(formatD.format(d));

    }

}
