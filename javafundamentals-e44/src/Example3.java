import java.util.List;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of();
        var result = list.stream()
                .reduce(0,(x,y)->x+y);
        System.out.println(result);

        Optional<Integer> result2 = list
                .stream()
                .reduce((x,y)->x+y);
        System.out.println(result2.isPresent());

    }
}
