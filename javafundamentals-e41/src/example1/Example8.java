package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    /*
    * skip()
    * peek()
    * java 9
    * takeWhile() // java9
    * dropWhile() // java9
    *
    * */
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,12);
        List<Integer> output = new ArrayList<>(); //this should contain even numbers

        output = list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(output);




    }
}
