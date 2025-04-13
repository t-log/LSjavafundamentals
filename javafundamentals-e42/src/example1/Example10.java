package example1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Example10 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF","DDD","AAA");

        //Collectors groupingBy example
        //splits into t wo partitions depending on a Predicate
        Map<Integer,List<String>> result = list.stream()
                .collect(Collectors.groupingBy(
                        s->s.length()
                ));
        System.out.println(result);
        Map<Integer,String> result2 = list.stream()
                .collect(Collectors.groupingBy(
                       s->s.length(),
                        Collectors.mapping(s->String.valueOf(s.length()),
                        Collectors.joining()
                )));
        System.out.println(result2);

        /*
        * groupingBy is a more general partitioningBy()
        * */


    }
}
