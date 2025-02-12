package example1;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example11 {
    public static void main(String[] args) {
        /*
        * collect() is a terminal operation
        * Collector is the obj that is used to specify how the stream is collected
        * joining, groupingBy, partioningBy
        * downstreaming feature
        * */

        List<Integer> res = Stream.of(1,2,3,4,5) //[1,2,3,4,5]
                .map(n->n*2) //[2,4,6,8,10]
                .collect(Collectors.toList());
        System.out.println(res);

        Set<Integer> res2 = Stream.of(1,2,3,4,5,5,1) //[1,2,3,4,5,5,1]
                .map(n->n*2) //[2,4,6,8,10,10,2]
                .collect(Collectors.toSet());
        System.out.println(res2);
    }
}
