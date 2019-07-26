import java.util.*;
import java.io.*;

class java08_8_1CollectionsTest{
    public static void main(String[] args) throws java.lang.Exception{
        // 
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(-10);
        al.add(5);
        System.out.println(al);
        
        //Collections 操作一些排序、旋转、交换等操作；
        Collections.reverse(al);
        System.out.println(al);
        
        Collections.rotate(al,2);
        System.out.println(al);
        
        Collections.sort(al);
        System.out.println(al);
        
        Collections.shuffle(al);
        System.out.println(al);
        
        List saftAl = Collections.synchronizedList(al);
        //不可变类创建方法
        System.out.println("===== UnmodifiableLink =====");
        List unmodifiableLink = Collections.unmodifiableList(al);
        
        //unmodifiableLink.add(5);
        System.out.println(unmodifiableLink);
        

        }
}
