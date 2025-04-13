package example1;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF","DDD","AAA");

        String res1 = list.stream()
                        .collect(Collectors.joining());
        String res2 = list.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(res2);
    }
}
