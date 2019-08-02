import java.util.*;
import java.io.*;

class print<T>{
    public print(T t){
        System.out.println(t);
    }
}
class java09_4_5PrintGeneric{
    public static void main(String[] args) throws java.lang.Exception{
        //有趣简单 实用的 print泛型类；
        new print("I'm the best of the world!");
        
        new print(99);
        
        new print(25.55566666999);
        
        List l = new ArrayList();
        l.add("Peng");
        l.add("fei");
        
        new print(l);
        
        List  l2  = new ArrayList(){{ //List<String> l2  = new ArrayList<String>(){{
            add("P");
            add("f");
        }};
        new print(l2);
        }
}
