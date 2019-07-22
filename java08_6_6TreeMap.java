import java.util.*;
import java.io.*;

class C implements Comparable{
    int age;
    public C(int age){
        this.age = age;
    }
    public String toString(){
        return "C{age: is "+age+"}";
    }
    public int compareTo(Object obj){
        C c = (C) obj;
        return age>c.age? 1: age< c.age? -1:0;
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj!= null && obj.getClass()==C.class){
            return age == ((C)obj).age;
        }
        return false;
    }
}

class java08_6_6TreeMap{
    public static void main(String[] args) throws java.lang.Exception{
        // 练习重要的树形图， treeMap，有顺序的map？ 红黑树结构；
        TreeMap tm = new TreeMap();
        tm.put(new C(20),"CuiYoung");
        tm.put(new C(30),"CuiPh.D");
        tm.put(new C(10),"CuiPrimarySchool");
        
        System.out.println(tm.firstEntry());
        
        tm.put(new C(-1),"CuiUnBorn");
        System.out.println(tm.lastEntry());
        
        System.out.println(tm.subMap(new C(21), new C(50) ) );
        
        System.out.println(tm);
        
        //非常 关键的，自己采用其提供方法，造了一个遍历，广泛利用强制转换；
        for(C ii = (C)(tm.firstKey()); ((C)ii) != (C)(tm.lastKey()); ii = (C) tm.higherKey(ii)){
            System.out.println("Cui's Life Stage "+ ii +" do what? "+ tm.get(ii));
        }
        //System.out.println("Cui's Life Stage "+ ii +" do what? "+ tm.get(ii));
        
        tm.forEach((o1,o2)->System.out.println(o1+" is  doing "+ o2));
        
    }
}
