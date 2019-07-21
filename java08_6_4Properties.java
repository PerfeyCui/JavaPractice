import java.util.*;
import java.io.*;

class java08_6_4Properties{
    public static void main(String[] args) throws java.lang.Exception{
        // 建立Hashtable的子类，key-value仅仅只能是string的，非常有用的注册表之类的成对、属性值；
        // 当年设置地欲仙欲死的东西；
        Properties prop = new Properties();
        
        prop.setProperty("UsrName","Pengfei");
        prop.setProperty("Code","120388");
        
        System.out.println(prop);
        //prop.list(System.out::print);
        prop.store(new FileOutputStream("cui.ini"),"property list plz action!");
        
        Properties propL = new Properties();
        propL.load(new FileInputStream("cui.ini"));
        System.out.println("===Save property file & load them print again===");
        propL.setProperty("Task","WritePaper");
        System.out.println(propL);
        
    }
}
