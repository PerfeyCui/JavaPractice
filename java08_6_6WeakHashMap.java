import java.util.*;
import java.io.*;


class java08_6_6WeakHashMap{
    public static void main(String[] args) throws java.lang.Exception{
        // 弱hash图，弱引用的key值的 entry条目，可以回收。被System。gc（）择机回收；
        WeakHashMap whm = new WeakHashMap();
        whm.put(new String("girl 1"),25);
        whm.put(new String("girl 2"),28);
        whm.put("girl dependent",20);
        
        System.out.println(whm);
        
        System.gc();
        System.runFinalization();
        System.out.println(whm);
    }
}
