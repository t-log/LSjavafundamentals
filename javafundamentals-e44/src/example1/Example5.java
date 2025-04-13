package example1;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,10,11,15,23,28,39,59,100);

        var res1 = list.stream()
                .collect(Collectors.minBy((x,y)->x-y));

        var res2 = list.stream()
                .collect(Collectors.maxBy((x,y)->x-y));

        var res3 = list.stream()
                .collect(Collectors.minBy((x,y)->x+y)); //even though its minBy we reverse the comparator provided so it
        //behaves as maxBy

        var res4 = list.stream()
                .collect(Collectors.maxBy((x,y)->x+y)); ////even though its minBy we reverse the comparator provided so
        //it behaves as minBy

        var res5 = list.stream()
                        .collect(Collectors.reducing((x,y)->x+y));

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);


    }
}
