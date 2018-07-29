import java.util.*;
import java.text.*;
import java.time.format.*;
import java.time.*;

public class NewFormatTest7_7_1
{
    public static void main(String[] args)
 {
     //three kinds of datetimeFormatter to generate date,then output
     //Create DTF array which includes static property, 2 local dateTF 3 selfDefine
     DateTimeFormatter[] dtf = new DateTimeFormatter[]{
         DateTimeFormatter.ISO_DATE,
         DateTimeFormatter.ISO_TIME,
         DateTimeFormatter.ISO_DATE_TIME,
         //local ways, SelfDefine
         DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL),
         DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT),
         DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.SHORT),
         DateTimeFormatter.ofPattern("Gyyyy MMM dd a HH mm OOOO"),
         
     };
     DateTimeFormatter dateS = DateTimeFormatter.ISO_INSTANT;
     //System.out.println("Me output"+dateS.toString());
     
     LocalDateTime ldt = LocalDateTime.now();
     for(int i = 0;i<dtf.length;i++) //DateTimeFormatter d:dtf)
     {System.out.println(dtf[i].format(ldt));}
 }
    
}
