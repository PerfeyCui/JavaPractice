import java.io.*;
import java.util.*;
class ArrayDeque08_5_2  
{
	public static void main (String[] args) throws java.lang.Exception
	{
        //推荐的栈实现，用ArrayDeque（queue的一种基于数组的实现） double-ended queue；Deque
        // 按照栈实现，stackADeque， push 入， pop出（FILO）；
        System.out.println("----按照stack实现 -----");
        
        ArrayDeque stackADeque = new ArrayDeque();
        stackADeque.push("CH Measurement");
        stackADeque.push("AI research");
        stackADeque.push("WIFI measurement");
        
        System.out.println(stackADeque.peek());
        System.out.println(stackADeque);
        System.out.println(stackADeque.poll());
        System.out.println(stackADeque);
        
        // 按照队列实现，ADeque， offer入， poll出，查看peek 队头；
       System.out.println("----As a queue impliment-----");
       ArrayDeque quePeng = new ArrayDeque();
       quePeng.offer("Channel Measr.");
       quePeng.offer("RNN");
       quePeng.offer("WIFI PHY");
       
       System.out.println(quePeng.peek());
       System.out.println(quePeng);
       System.out.println(quePeng.poll());
       quePeng.forEach(System.out::println);
	}
}
