import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    /* Collectors Part-2 and the Optional Class */
    public static void main(String[] args) {



        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        //downstreaming at a glance
        int res = list.stream()
                .collect(Collectors.mapping(s->s.length(),
                        Collectors.summingInt(s->s)));
        System.out.println(res);


    }
}
