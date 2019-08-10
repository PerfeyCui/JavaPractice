import java.io.*;
import java.util.*;

 class print <T>{
     public print (T t){
        System.out.println(t);
    }
}

 class java16_2_2MultiThreadImplementsRunable  implements Runnable
{
    private int i=1;//方法实例私有的变量；
    public void run(){
        for(;i<100;i++){
            new print(Thread.currentThread().getName()+" "+i+" "+
            Thread.currentThread().getPriority());// 注意继承接口，不能用this.getName()来取得值了。
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    //new java16_2_1ExtendsThread().start();
	    
		new print("yes");//注意到yes反而先输出了； 因为是主线程，并行输出比较快；新线程输出较慢；
		
		for(int i = 1; i<=60; i++){
		    new print(Thread.currentThread().getName()+" "+i+" "+Thread.currentThread().getPriority());
		    if(i==30){
		        java16_2_2MultiThreadImplementsRunable runTarget = new java16_2_2MultiThreadImplementsRunable();
		        new Thread(runTarget,"线程1").start();
		        new Thread(runTarget,"线程2").start();
		    }
		}
	}
}

//**************************************************************************
yes
main 1 5
main 2 5
main 3 5
main 4 5
main 5 5
main 6 5
main 7 5
main 8 5
main 9 5
main 10 5
main 11 5
main 12 5
main 13 5
main 14 5
main 15 5
main 16 5
main 17 5
main 18 5
main 19 5
main 20 5
main 21 5
main 22 5
main 23 5
main 24 5
main 25 5
main 26 5
main 27 5
main 28 5
main 29 5
main 30 5
线程1 1 5
线程1 2 5
线程1 3 5
线程1 4 5
线程1 5 5
线程1 6 5
线程1 7 5
线程1 8 5
线程1 9 5
线程1 10 5
线程1 11 5
线程1 12 5
线程1 13 5
线程1 14 5
线程1 15 5
线程1 16 5
线程1 17 5
线程1 18 5
线程1 19 5
线程1 20 5
线程1 21 5
线程1 22 5
线程1 23 5
线程1 24 5
线程1 25 5
线程1 26 5
线程1 27 5
线程1 28 5
线程1 29 5
线程1 30 5
线程1 31 5
线程1 32 5
线程1 33 5
线程1 34 5
线程1 35 5
线程1 36 5
线程1 37 5
线程1 38 5
线程1 39 5
线程1 40 5
线程1 41 5
线程1 42 5
线程1 43 5
线程1 44 5
线程1 45 5
线程1 46 5
线程1 47 5
线程1 48 5
线程1 49 5
线程1 50 5
线程1 51 5
线程1 52 5
线程1 53 5
线程1 54 5
线程1 55 5
线程1 56 5
线程1 57 5
线程1 58 5
线程1 59 5
线程1 60 5
线程1 61 5
线程1 62 5
线程1 63 5
线程1 64 5
线程1 65 5
线程1 66 5
线程1 67 5
线程1 68 5
线程1 69 5
线程1 70 5
线程1 71 5
线程1 72 5
线程1 73 5
线程1 74 5
线程1 75 5
线程1 76 5
线程1 77 5
线程1 78 5
线程1 79 5
线程1 80 5
线程1 81 5
线程1 82 5
线程1 83 5
线程1 84 5
线程1 85 5
线程2 82 5
main 31 5
main 32 5
main 33 5
main 34 5
main 35 5
main 36 5
main 37 5
main 38 5
main 39 5
main 40 5
main 41 5
main 42 5
main 43 5
main 44 5
main 45 5
main 46 5
main 47 5
main 48 5
main 49 5
main 50 5
main 51 5
main 52 5
main 53 5
main 54 5
main 55 5
main 56 5
main 57 5
main 58 5
main 59 5
main 60 5
线程2 87 5
线程2 88 5
线程2 89 5
线程2 90 5
线程2 91 5
线程2 92 5
线程2 93 5
线程2 94 5
线程2 95 5
线程2 96 5
线程2 97 5
线程2 98 5
线程2 99 5
线程1 86 5


Note: /usercode/file.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
注意线程1 是 86就结束了？为啥呢 最后读取了共享变量i，发现是99了，结束！  多个核引发的可见性产生的问题吧？
