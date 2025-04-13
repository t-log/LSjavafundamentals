package example1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Example9 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF","DDD","AAA");

        //Collectors partitioningBy example
        //splits into t wo partitions depending on a Predicate
        Map<Boolean,List<String>> result = list.stream()
                .collect(Collectors.partitioningBy(
                        s->s.length()%2==0
                ));
        System.out.println(result);
        Map<Boolean,Set<String>> result2= list.stream()
                .collect(Collectors.partitioningBy(
                        s->s.length()%2==0,
                        Collectors.toSet()
                ));
        System.out.println(result2);
        Map<Boolean,String> result3 = list.stream()
                .collect(Collectors.partitioningBy(
                        s->s.length()%2==0,
                        Collectors.joining()
                ));
        System.out.println(result3);
        Map<Boolean,String> result4 = list.stream()
                .collect(Collectors.partitioningBy(
                        s->s.length()%2==0,
                        Collectors.mapping(
                                s->String.valueOf(s.length()),
                                Collectors.joining()
                        )
                ));
        System.out.println(result4);

        /*
        * groupingBy is a more general partitioningBy()
        * */


    }
}
