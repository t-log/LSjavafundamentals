package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example7 {
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
        List<Integer> output = new ArrayList<>(); //this should contain even numbers

        list.stream()
                .filter(n->n%2==0)
                .peek(n->output.add(n))              // not recommended use only Collector to collect result
               /*
               allows you to observe the elements of a stream as they pass through a pipeline, without modifying them

               */

                .forEach(n-> System.out.print(""));  // the stream pipeline will only execute when there is a terminal op

        System.out.println(output);




    }
}
