package main;

import hello.Hello;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        try {
//            /* Reflection API
//            *  used by popular frameworks like Spring for IoC (Inversion of Control)
//            *
//            * */
//            Class<?> c = Class.forName("example.Example");
//            Constructor con = c.getDeclaredConstructor();
//            Object o = con.newInstance();
//            System.out.println(o);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        ServiceLoader<Hello> loader = ServiceLoader.load(Hello.class);
        //Searches for Hello implementation in module path
        loader.stream() /*
        With every impl found in module path
        Every impl of Hello gets called
        Nothing happens until you add each impl in module path
        */
                .forEach(c -> System.out.println(c.get().sayHello()));

        mapTest(new TreeMap<String,String>());
    }
    public static Map<String,String> mapTest(Map<String,String> map){
        System.out.println("inside mapTest");
        return map;
    }
}