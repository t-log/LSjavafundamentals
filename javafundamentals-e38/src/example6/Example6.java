package example6;

import java.util.function.BiFunction;

public class Example6 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String> b1 = (a,b) -> a + "" + b;
        String res = b1.apply(10,5);
        System.out.println(res);
    }
}
