package example3;

import java.util.List;
import java.util.stream.Stream;

public class Example3 {
    //terminal operations
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,3,8,9);

        boolean b1 = list.stream()
        .anyMatch(x->x%2==0);

        boolean b2 = list.stream()
        .allMatch(x->x%2==0);

        boolean b3 = list.stream()
        .noneMatch(x->x%2==0);

//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);

        Stream<Integer> s5 = Stream.iterate(1, //finite stream
                i->i<10,
                i->i+1);

        System.out.println(s5.anyMatch(x -> x % 2 == 0));

        Stream<Integer> s6 = Stream.iterate(1,              //infinite stream
                i->i+2);
//        System.out.println(s6.anyMatch(x -> x % 2 == 0));
    }
}
