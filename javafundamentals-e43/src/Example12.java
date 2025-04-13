import java.util.Optional;
import java.util.stream.Collectors;

public class Example12 {
    /* Optional Class
    * */
    public static void main(String[] args) {
        //or Else
        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);
        Optional<String> o3 = Optional.of("");

       //stream of Optional
        var res = o1.stream() // stream of one element
                .collect(Collectors.counting());

        var res2 = o2.filter(x->x%2==0)
                .orElse(-1);
       


    }

}
