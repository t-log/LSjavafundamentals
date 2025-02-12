package example2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example2 {
    /*
    * Consumer
    * BiConsumer
    * Supplier
    * Function
    * BiFunction
    * Predicate
    * BiPredicate
    * UnaryOperator
    * BinaryOperator
    * */
    public static void main(String[] args) {
        //1.Consumer = Consumes an object but does not return anything
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello!");

        BiConsumer<Integer, String> c2 = (a,b) -> System.out.println(a + " " + b);
        c2.accept(10,":)");
    }
}
