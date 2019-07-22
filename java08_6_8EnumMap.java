import java.util.*;
import java.io.*;

  enum Week{
            Mon,Tue,Wed,Thr,Fri,Sun
        }// enum枚举类还不能是local局部的，要全局定义；

class java08_6_8EnumMap{
    public static void main(String[] args) throws java.lang.Exception{
        // 枚举图，以枚举类型作为构造； 每个entry要关联一个枚举值；
      
        
        EnumMap em = new EnumMap(Week.class);// 格式，指明枚举类；
        em.put(Week.Mon,"星期一");
        em.put(Week.Tue,"星期二");
        em.put(Week.Sun,"星期天");
        
        System.out.println(em);
        
        }
}
