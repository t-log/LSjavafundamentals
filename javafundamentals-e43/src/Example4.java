import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    /* Collectors Part-2 and the Optional Class */
    public static void main(String[] args) {

        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        //sum
        long res = list.stream()
                .mapToInt(s->s.length())
                .sum();

        //count
        long res2 = list.stream()
                .mapToInt(s->s.length())
                .count();

        //average
        var res3 = list.stream()
                .mapToInt(s->s.length())
                .average();

        //now what if you need to do all the above three at once? summarising to the rescue!
        IntSummaryStatistics res4 = list.stream()
                                .mapToInt(s->s.length())
                                .summaryStatistics();
        System.out.println(res4.getCount());
        System.out.println(res4.getAverage());
        System.out.println(res4.getSum());

        //collectors way

        IntSummaryStatistics res5 = list.stream()
                .collect(Collectors.summarizingInt(s->s.length()));

        System.out.println(res5);


    }
}
