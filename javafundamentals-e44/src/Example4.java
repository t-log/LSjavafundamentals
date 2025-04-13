import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Example4 {
    /*primitive streams
    * IntStream , LongStream , DoubleStream map() , mapToInt()
    *
    * OptionalInt , OptionalLong , OptionalDouble
    *
    * average() , min() , max() , reduce()
    * */
    public static void main(String[] args) {


        OptionalDouble result = IntStream.of(2,3,4,5,6,7,8,9)
                .average();
        System.out.println(result);
    }
}
