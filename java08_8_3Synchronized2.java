import java.util.*;
import java.io.*;

class java08_8_3Synchronized{
    public static void main(String[] args) throws java.lang.Exception{
        // 利用Collections 类，包装？线程不安全的Set Link Map可以变为安全的；
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
        
        }
}
