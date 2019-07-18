import java.io.*;
import java.util.*;
class HashMap08_6 
{
	public static void main (String[] args) throws java.lang.Exception
	{
        //HashMap 实现map， 内置类的条目 Entry子类； 其value 为null时候，其实就是Set类；
        // HashMap的实现、put、remove + - 查询 和遍历操作；
        Map pengBookHM = new HashMap();
        pengBookHM.put("2015","DigitalComm");
        pengBookHM.put("2015.10","WirelessComm");
        pengBookHM.put("2019","DeepLearning");
        pengBookHM.put("2019.7","Mxnet");
        
        System.out.println(pengBookHM);
        System.out.println(pengBookHM.containsKey("2019"));
        System.out.println(pengBookHM.containsValue("Mxnet"));
        
        System.out.println(pengBookHM.remove("2019","DeepLearning"));
        System.out.println("Traverse with forEach, super loop=========");
        //pengBookHM.forEach(System.out::println);
        
        System.out.println("Traverse with keySet=======");
        for(Object s : pengBookHM.keySet()){//注意遍历对象，不是string，而是object，一开始是未知的；
            System.out.println(s+" "+pengBookHM.get(s));
        }
        
        System.out.println(pengBookHM.toString());
        System.out.println(pengBookHM.entrySet());
	}
}
