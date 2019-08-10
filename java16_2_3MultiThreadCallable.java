import java.io.*;
import java.util.concurrent.*;
import java.util.*;
import java.lang.*;


 class print <T>{
     public print (T t){
        System.out.println(t);
    }
}

 class java16_2_3MultiThreadCallable
{
    public static void main(String[] args){
     //java16_2_3MultiThreadCallable tc = new java16_2_3MultiThreadCallable();
     
    FutureTask<Integer> ft = new FutureTask<Integer> ( (Callable<Integer>)()->{
        int i = 0;
        for(;i<100;i++){
            new print(Thread.currentThread().getName()+" "+i);
        }
        return i;
    });
    
    for(int ii=0; ii<100;ii++){
        new print(Thread.currentThread().getName()+" "+ii);
        if(ii==25){
            
            new Thread(ft,"线程00").start();
            new Thread(ft,"线程01").start();
        }
    }
    
    new print("I'm main, i'm very quick!");
    }
}
利用FutureTask封装Callable接口实现多线程

注意import 其util.concurrent.* 这个并发包，非常重要
