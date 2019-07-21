//import java.io.*;
import java.util.*;
class HashMap08_6_1 
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
        
        pengBookHM.replace("2019.7","MxNet Best NN");
        System.out.println(pengBookHM);
        
        pengBookHM.merge("2019","New",(oldVal, param)-> ((String)oldVal).length()+((String)param).length());
        System.out.println(pengBookHM);
        
        pengBookHM.computeIfPresent("2015",(key,value)->( ( (String)key).concat((String)value)));
        pengBookHM.merge("2019.7","New",(v1, param)-> ((String)v1).concat(((String)param)));
        System.out.println(pengBookHM);
        
        pengBookHM.forEach((key,value)-> System.out.println(key+"->"+value));
        
	}
}
