import java.io.*;
import java.util.*;
class FixedSizeList08_4_3  
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	// 1)����arrays.aslist ����һ�� �̶���list�� 2 �� ����List��
    	// 3����ͼ����Ԫ�أ����׳����쳣
      List cuiFamily = Arrays.asList("Ligeng","Yilan","pengfei");
      //cuiFamily.add(1,"Hui");// asList���ɵ��ǹ̶����ȵ�List�����Բ�����ӣ�ɾ����
      //cuiFamily.remove("pengfei");
      System.out.println("----foreach ����ʽ����----");
      cuiFamily.forEach(System.out::println);
      cuiFamily.forEach(System.out::println);
      
      ListIterator li = cuiFamily.listIterator();
      
      System.out.println("==== �������====");
      while(li.hasNext()){
          System.out.println(li.next());
      }
      
      ListIterator li2 = cuiFamily.listIterator(3);
      System.out.println("---- �������-----");
      while(li2.hasPrevious()){
          System.out.println(li2.previous());
      }
	}
}
