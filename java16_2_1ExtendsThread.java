import java.io.*;
import java.util.*;

 class print <T>{
     public print (T t){
        System.out.println(t);
    }
}

 class java16_2_1ExtendsThread extends Thread  
{
    private int i=50;//方法实例私有的变量；
    public void run(){
        for(;i<100;i++){
            new print(getName()+" "+i);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    new java16_2_1ExtendsThread().start();
	    
		new print("yes");//注意到yes反而先输出了； 因为是主线程，并行输出比较快；新线程输出较慢； 多线程编程差异，程序执行流和代码的执行流不一致了。千万注意
		
	}
}
// 上面是启动一个线程，从i=50输出到99； 下面开始多线程并行了；


//**********************************************8
//
import java.io.*;
import java.util.*;

 class print <T>{
     public print (T t){
        System.out.println(t);
    }
}

 class java16_2_1ExtendsThread extends Thread  
{
    private int i=50;//方法实例私有的变量；
    public void run(){
        for(;i<100;i++){
            new print(getName()+" "+i);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    new java16_2_1ExtendsThread().start();
	    
		new print("yes");//注意到yes反而先输出了； 因为是主线程，并行输出比较快；新线程输出较慢；
		
		for(int i = 1; i<=60; i++){
		    new print(Thread.currentThread().getName()+" "+i+" "+Thread.currentThread().getPriority());
		    if(i==30){
		        new java16_2_1ExtendsThread().start();
		        new java16_2_1ExtendsThread().start();
		    }
		}
	}
}
//********************************** Results ************************************************//
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
Thread-0 50
Thread-0 51
Thread-0 52
Thread-0 53
Thread-0 54
Thread-0 55
Thread-0 56
Thread-0 57
Thread-0 58
Thread-0 59
Thread-0 60
Thread-0 61
Thread-0 62
Thread-0 63
Thread-0 64
Thread-0 65
Thread-0 66
Thread-0 67
Thread-0 68
Thread-0 69
Thread-0 70
Thread-0 71
Thread-0 72
Thread-0 73
Thread-0 74
Thread-0 75
Thread-0 76
Thread-0 77
Thread-0 78
Thread-0 79
Thread-0 80
Thread-0 81
Thread-0 82
Thread-0 83
Thread-0 84
Thread-0 85
Thread-0 86
Thread-0 87
Thread-0 88
Thread-0 89
Thread-0 90
Thread-0 91
Thread-0 92
Thread-0 93
Thread-0 94
Thread-0 95
Thread-0 96
Thread-0 97
Thread-0 98
Thread-0 99
Thread-1 50
Thread-1 51
Thread-1 52
Thread-1 53
Thread-1 54
Thread-1 55
Thread-1 56
Thread-1 57
Thread-1 58
Thread-1 59
Thread-1 60
Thread-1 61
Thread-1 62
Thread-1 63
Thread-1 64
Thread-1 65
Thread-1 66
Thread-1 67
Thread-1 68
Thread-1 69
Thread-1 70
Thread-1 71
Thread-1 72
Thread-1 73
Thread-1 74
Thread-1 75
Thread-1 76
Thread-1 77
Thread-1 78
Thread-1 79
Thread-1 80
Thread-1 81
Thread-1 82
Thread-1 83
Thread-1 84
Thread-1 85
Thread-1 86
Thread-1 87
Thread-1 88
Thread-1 89
Thread-1 90
Thread-1 91
Thread-1 92
Thread-1 93
Thread-1 94
Thread-1 95
Thread-1 96
Thread-1 97
Thread-1 98
Thread-1 99
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
Thread-2 50
Thread-2 51
Thread-2 52
Thread-2 53
Thread-2 54
Thread-2 55
Thread-2 56
Thread-2 57
Thread-2 58
Thread-2 59
Thread-2 60
Thread-2 61
Thread-2 62
Thread-2 63
Thread-2 64
Thread-2 65
Thread-2 66
Thread-2 67
Thread-2 68
Thread-2 69
Thread-2 70
Thread-2 71
Thread-2 72
Thread-2 73
Thread-2 74
Thread-2 75
Thread-2 76
Thread-2 77
Thread-2 78
Thread-2 79
Thread-2 80
Thread-2 81
Thread-2 82
Thread-2 83
Thread-2 84
Thread-2 85
Thread-2 86
Thread-2 87
Thread-2 88
Thread-2 89
Thread-2 90
Thread-2 91
Thread-2 92
Thread-2 93
Thread-2 94
Thread-2 95
Thread-2 96
Thread-2 97
Thread-2 98
Thread-2 99


Note: /usercode/file.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

