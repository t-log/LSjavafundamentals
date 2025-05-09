package example5;

import java.util.function.Function;

public class Example5 {
    public static void main(String[] args) {
        // it consumes and supplies something Function
        Function<String, Integer> f1 = s -> s.length();
        int x = f1.apply("Hello");
        System.out.println(x);
    }
}
