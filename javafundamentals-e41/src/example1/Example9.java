package example1;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,50,70,100,130);

        list.stream()
                .takeWhile(n->n<=100) // like a while with condition while(condition)
                .forEach(System.out::println);

        //dropWhile is just the opposite of takeWhile

        list.stream()
                .dropWhile(n->n<=100)
                .forEach(System.out::println);

        // collectors , optional , parallel streams (after threads)

    }
}
