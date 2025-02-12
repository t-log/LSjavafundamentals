package example4;

import java.util.function.Supplier;

public class Example4 {
    public static void main(String[] args) {
        Supplier<Integer> s1 = ()-> 10;
        Integer x = s1.get();
        System.out.println(x);
    }
}
