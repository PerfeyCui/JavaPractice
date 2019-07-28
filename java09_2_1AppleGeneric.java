import java.util.*;
import java.io.*;

class Apple<T>{
    private T info;
    public Apple(){}
    public Apple(T t){
        this.info= t;
    }
    public void setT(T info){
        this.info = info;
    }
    public T getT(){
        return info;
    }
}

class java09_2_1AppleGeneric{
    public static void main(String[] args) throws java.lang.Exception{
        // Apple 的泛型，定义、声明（除了集合类以外，所有类 接口都可以声明、使用泛型）
        Apple<String> apStr = new Apple<>("PhoneX");
        apStr.setT("Ph 8 Plus +++");
        System.out.println(apStr.getT());
        
        Apple<Integer> apInt = new Apple<>(8);
        System.out.println(apInt.getT());

        }
}
