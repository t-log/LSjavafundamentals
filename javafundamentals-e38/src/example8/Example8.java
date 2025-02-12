package example8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Example8 {
    // More particular Function
    public static void main(String[] args) {
        UnaryOperator<Integer> u = n -> n*10;
        System.out.println(u.apply(1));

        BinaryOperator<Integer> u2 = (a,b) -> a*b;
        System.out.println(u2.apply(5, 2));
    }


}
