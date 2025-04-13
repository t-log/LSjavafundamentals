package example1;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF","DDD","AAA");

//        Map<String,Integer> map1 = list.stream()
//                .collect(Collectors.toMap(
//                        s -> s,
//                        s -> s.length()
//                ));

//        Map<String,Integer> map1 = list.stream()
//                .collect(Collectors.toMap(
//                        s -> s,
//                        s -> s.length(),
//                        (a,b) -> a+b
//                ));
        /*
        * If you have duplicates it will throw an error but you can use the third parameter to handle the case of
        * duplicates
        * */
        TreeMap<String,Integer> map1 = list.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (a,b) -> a+b,
                        () -> new TreeMap<>()
                ));
        System.out.println(map1);
    }
}
