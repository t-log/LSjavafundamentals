package example1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example1 {
    /*
    *
    * */
    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF");

        List<String> res =
        list.stream()
                //intermediary ops
                .collect(Collectors.toList());
        /*
        * Collectors class (utility class)
        * */

        Set<String> res2 =
                list.stream()
                        //intermediary ops
                        .collect(Collectors.toSet());

        Set<String> res3 =
                list.stream()
                        //intermediary ops
                        .collect(Collectors.toCollection(TreeSet::new));
    }
}
