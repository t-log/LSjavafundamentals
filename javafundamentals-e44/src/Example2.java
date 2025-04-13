import java.util.List;
import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        /*
        * min() and max()
        * */
        List<Integer> list = List.of(3,4,5,6,7,8,9,0);

        Optional<Integer> o1 = list.stream()
                .min((x,y)->x-y);

        o1.ifPresent(System.out::println);

        Optional<Integer> o2 = list.stream()
                .max((x,y)->x-y);
        o2.ifPresent(System.out::println);
    }
}
