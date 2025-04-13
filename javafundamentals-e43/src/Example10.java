import java.util.Optional;
import java.util.function.Supplier;

public class Example10 {
    /* Optional Class
    * */
    public static void main(String[] args) {
        //or Else
        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);
        Optional<String> o3 = Optional.of("");

        //map        x->y
        //flatmap    x->Optional(y)

        var res1 = o2.map(x->x*2).orElse(-1);
        System.out.println(res1);

        var res2 = o2.flatMap(x->Optional.of(2*x)).orElse(-1);
        System.out.println(res2);


    }

}
