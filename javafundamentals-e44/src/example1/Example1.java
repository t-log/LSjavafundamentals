package example1;

import java.util.Optional;
import java.util.stream.Stream;

/*
* methods in streams that relates to Optional
* */
public class Example1 {
    /*
    * findFirst() //terminal
    * findAny()
    *
    * */
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty();
        Stream<Integer> s2 = Stream.of(10,20,30,40,50,60);

        Optional<Integer> o1 = s1.findFirst();
        System.out.println(o1.isPresent());
        Optional<Integer> o2 = s2.findFirst();
        System.out.println(o2.isPresent());

    }
}
