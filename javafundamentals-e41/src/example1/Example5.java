package example1;

import java.util.List;

public class Example5 {
    /*
    * skip()
    * peek()
    * java 9
    * takeWhile()
    * dropWhile()
    *
    * */
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,12);
//        list.stream()
//                .filter(n->n%2==0)
//                .skip(4)
//                .forEach(System.out::println);
        list.stream()
                .peek(System.out::println) //[1,2,3,4,5,6,7,8,9,10,12]
//                .filter(n->n%2==0)
                .forEach(n->System.out.println("hi")); // [2,4,6,8,10,12]

    }
}
