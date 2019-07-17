import java.io.*;
import java.util.*;
class FixedSizeList08_4_3  
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	// 1)利用arrays.aslist 生成一个 固定长list； 2 ） 遍历List；
    	// 3）试图增加元素，看抛出的异常
      List cuiFamily = Arrays.asList("Ligeng","Yilan","pengfei");
      //cuiFamily.add(1,"Hui");// asList生成的是固定长度的List，所以不能添加，删除；
      //cuiFamily.remove("pengfei");
      System.out.println("----foreach 函数式迭代----");
      cuiFamily.forEach(System.out::println);
      cuiFamily.forEach(System.out::println);
      
      ListIterator li = cuiFamily.listIterator();
      
      System.out.println("==== 正向迭代====");
      while(li.hasNext()){
          System.out.println(li.next());
      }
      
      ListIterator li2 = cuiFamily.listIterator(3);
      System.out.println("---- 反向迭代-----");
      while(li2.hasPrevious()){
          System.out.println(li2.previous());
      }
	}
}
