import java.util.Optional;

public class Example11 {
    /* Optional Class
    * */
    public static void main(String[] args) {
        //or Else
        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);
        Optional<String> o3 = Optional.of("");

       o2.ifPresent(
               x->{
                   System.out.println(x);
               }
       );



    }

}
