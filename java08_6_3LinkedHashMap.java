import java.util.*;

class java08_6_3LinkedHashMap{
    public static void main(String[] args) throws java.lang.Exception{
        HashMap lhm = new LinkedHashMap();
        lhm.put("Mum",66);
        lhm.put("Dad",68);
        lhm.put("Son",90);
        lhm.put("GSon",null);
        
        System.out.println(lhm);
        lhm.forEach((key,value)->System.out.println(key+"'s born year is "+value));
    }
}
