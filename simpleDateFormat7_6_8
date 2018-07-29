import java.util.*;
import java.text.*;

public class simpleDateFormat7_6_8
{
    public static void main(String[] args)
    throws ParseException
    {
        Date d = new Date();
        // create a SDF calss,transform now date to definite formate
        SimpleDateFormat sdf1 = new SimpleDateFormat("Gy年第D天第w周");
        String dates = sdf1.format(d);
        System.out.println(dates);
        //create a self-defined format of time, using SDF to parse them to
        String str = "18年====第51周";
        SimpleDateFormat sdf2 = new SimpleDateFormat("y年====第w周");
        Date d2 = sdf2.parse(str);
        System.out.println(d2);
    }
    
}
