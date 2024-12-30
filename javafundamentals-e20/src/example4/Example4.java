package example4;

import example5.Coffee;

import java.util.function.Function;

public class Example4 {
    static String c1 = "hi";
    public static void main(String[] args) {
        Reverse r1 = (a)->new StringBuilder(a).reverse().toString(); //gives you an object reference
        String reversed = r1.reverse("ABCD"); // then call the method using the reference
        System.out.println(reversed);

        Function<String,String> f1 = (a)->new StringBuilder(a).reverse().toString();
        String rev = f1.apply("ABCD");
        System.out.println(rev);

        Reverse r2 = (a)->new StringBuilder(a).reverse().toString();
        System.out.println(Example4.c1);
    }
}
