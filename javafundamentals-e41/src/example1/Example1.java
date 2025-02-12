package example1;

import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        /*
        * distinct()
        * sorted()/sorted(Comparator)
        * sorted() - Comparable (natural order)
        * */
        List<Integer> list = List.of(3,4,5,2,8,3,7,9,9,6,0,1,8,1);
//        list.stream()
//            .distinct()
//            .forEach(System.out::println);

//        list.stream()
//                .sorted(Collections.reverseOrder())
//                .forEach(System.out::println);

        /*
        * The order of operations on a stream might not affect the result but might affect performance
        * Eg : if you swap distinct() with sorted()
        * */

//        long startTimeSecond = System.nanoTime();
//        list.stream()
//                .sorted(Collections.reverseOrder())
//                .distinct()
//                .forEach(System.out::println);
//        long endTimeSecond = System.nanoTime();
//        System.out.println("Execution time 2nd: " + (endTimeSecond-startTimeSecond) + " nano secs");

//        long startTimeFirst = System.nanoTime();
//        list.stream()
//                .distinct()
//                .sorted(Collections.reverseOrder())
//                .forEach(System.out::println);
//        long endTimeFirst = System.nanoTime();
//        System.out.println("Execution time 1st: " + (endTimeFirst-startTimeFirst) + " nano secs");



//        var result = list.stream()
//                .sorted(Collections.reverseOrder())
//                .distinct()
//                .skip(1)
//                .findFirst();
//        System.out.println(result);



    }
}
