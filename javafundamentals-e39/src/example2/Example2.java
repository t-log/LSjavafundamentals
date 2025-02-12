package example2;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    /*
    * Sources : Collection
    * */
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty(); //finite
        /*Why do we need an empty stream?
        * To avoid null , (Receiving and returning null is considered an anti-pattern )
        *
        * */

        Stream<Integer> s2 = Stream.of(3,6,8,9,1,2,3); //finite

        Supplier<Integer> sup = () -> new Random().nextInt(); // infinite stream
        Stream<Integer> s3 = Stream.generate(sup);
//        s3.forEach(x-> System.out.println(x));

        /*As the above is an infinite stream we use limit() to limit the stream output*/

//        s3.limit(10).forEach(System.out::println);

//        Stream<Integer> s4 = Stream.iterate(1,i->i+1); //infinite stream
//        s4.
//        limit(10).
//        forEach(System.out::println);

        Stream<Integer> s5 = Stream.iterate(1,
                                            i->i<10,
                                            i->i+1);
        s5.forEach(System.out::println);

    }

}
