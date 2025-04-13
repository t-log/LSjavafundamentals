import java.util.Optional;
import java.util.function.Supplier;

public class Example9 {
    /* Optional Class
    * */
    public static void main(String[] args) {
        //or Else
        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);
        Optional<String> o3 = Optional.of("");

        o1.orElse("default value");
        o2.orElse(10);
        System.out.println(o1);
        System.out.println(o2);

        Supplier<String> s1 = () -> "";
        o1.orElseGet(s1);

        Integer i4 = o2.orElseThrow(()->new RuntimeException());
        String i5 = o1.or(()->o3).orElse("default");

        o1.ifPresentOrElse(
                x->{ System.out.println(x);
                },()->{
            System.out.println("There is no value");
        }
        );




    }

}
