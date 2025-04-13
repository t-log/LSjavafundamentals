import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    /* Collectors Part-2 and the Optional Class */
    public static void main(String[] args) {

        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        //averaging
        double res = list.stream()
                        .collect(Collectors.averagingInt(s->s.length()));
        System.out.println(res);




    }
}
