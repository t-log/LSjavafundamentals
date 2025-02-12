package example7;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example7 {
    // more particular type of Function
    public static void main(String[] args) {
        Predicate<Integer> p1 = x -> x % 2 == 0;
        boolean b1 = p1.test(10);
        System.out.println(b1);

        BiPredicate<String, Integer> p2 = (a,b)->a.length() == b;
        boolean res = p2.test("abc",3);
        System.out.println(res);
    }
}
