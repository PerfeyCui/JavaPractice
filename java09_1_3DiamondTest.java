import java.util.*;
import java.io.*;

class java09_1_3DiamondTest{
    public static void main(String[] args) throws java.lang.Exception{
        //泛型的菱形推断方法
        List<String> schoolCui = new ArrayList<>();
        schoolCui.add("阜宁中学");
        schoolCui.add("苏州大学");
        schoolCui.add("UTS");
        
        List<String> schoolSun = new ArrayList<>();
        schoolSun.add("菩提老祖");
        schoolSun.add("大闹天宫");
        schoolSun.add("八十一难大学");
        
        Map<String, List<String> > schoolMap = new HashMap<>();
        schoolMap.put("Pengfei",schoolCui);
        schoolMap.put("WuKong",schoolSun);
        
        schoolMap.forEach((k,v)->System.out.println(k+"-->历经 "+v));

        }
}
