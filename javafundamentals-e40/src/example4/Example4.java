package example4;

import java.util.List;

public class Example4 {
    //map x -> y
    // flatmap : flattens nested stream into a single stream
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,2,3,4,5),
                List.of(4,5,6),
                List.of(1,3)
        );
        var x = list.stream().        // List<Integer> [1,2,3,4,5] , [4,5,6], [1,3]
        flatMap(s->s.stream())               // Integer       [1,2,3,4,5,4,5,6,1,3]
        .reduce(0,(a,b)->a+b);
        System.out.println(x);
    }
}
