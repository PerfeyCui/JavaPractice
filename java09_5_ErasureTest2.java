import java.util.*;
import java.io.*;

class java09_5_ErasureTest2{
    public static void main(String[] args) throws java.lang.Exception{
        //泛型擦除和转换， Apple<>泛型赋值给非泛型 Apple时候，定为上限类型；
        List li = new ArrayList<Integer>();
        li.add(5);
        li.add(20);
        
        //System.out.println(li.get(0));//若是强制转换就簇问题了
        
        //System.out.println((String)li.get(0));
        
        //泛型下限 用于TreeSet的排序订制；
        TreeSet<String> ts1 = new TreeSet<>(
            new Comparator<Object>(){
                public int compare(Object o1, Object o2){
                    return o1.hashCode()>o2.hashCode()? 1: o1.hashCode()>o2.hashCode()? -1:0;
                }
            }
        );
        ts1.add("Pengfei");
        ts1.add("cuiFei");
        ts1.add("Cui");
        System.out.println(ts1);
        ts1.forEach(o1-> System.out.println(o1));
        
        TreeSet<String> ts2 = new TreeSet<>(
            new Comparator<String>(){
                public int compare(String s1, String s2){
                    return s1.length()>s2.length()? 1:s1.length()<s2.length()?-1:0;
                }
                }
                );
                
                ts2.add("Pengfei");
                ts2.add("Cui");
                ts2.add("cuiFei");
                System.out.println(ts2);
        }
}
