import java.io.*;
import java.util.*;
class PriorityQueue08_5_1  
{
	public static void main (String[] args) throws java.lang.Exception
	{
        //创建优先队列，Collection根接口三大子类的queue类的一个实现，违反FIFO原则，
        //具有优先级的，下面1）场景PriorityQueue， 2）遍历PriorityQueue
        PriorityQueue pq = new PriorityQueue();
        
        pq.add(20);
        pq.offer(-10);
        pq.offer(25);
        
        //直接打印 pq，运用貌似 iterator打印的
        System.out.println(pq);
        
        System.out.println(pq.peek());
        //运用foreach方便的方法
        pq.forEach(System.out::println);
        //运用Iterator
        Iterator it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
	}
}
