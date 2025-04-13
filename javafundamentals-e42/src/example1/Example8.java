package example1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Example8 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF","DDD","AAA");

        //Collectors filtering example
        List<Integer> result = list.stream()
                .collect(Collectors.mapping(
                        s -> s.length(), //string to int
                        Collectors.filtering(
                                s->s % 2 == 0,      //filters only even numbers
                                Collectors.toList() // downstreaming
                        )
                ));
        System.out.println(result);

        /*the above is equivalent to */
        List<Integer> result2 = list.stream()
                .map(s->s.length())
                .filter(s->s%2==0)
                .collect(Collectors.toList());
        System.out.println(result2);


    }
}
