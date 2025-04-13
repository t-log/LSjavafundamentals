import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    /* Collectors Part-2 and the Optional Class */
    public static void main(String[] args) {

        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        //without
        int res1 = list.stream()
                .mapToInt(s->s.length())
                .sum();
        System.out.println(res1);

        //with
        int res2 = list.stream()
                .collect(Collectors.summingInt(s->s.length()));
        System.out.println(res2);



    }
}
