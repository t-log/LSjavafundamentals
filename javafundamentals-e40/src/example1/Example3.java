package example1;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        /*
        * Stream
        * map()            Stream -> Stream
        * mapToInt()       Stream -> IntStream   // these are more particular contracts
        * mapToLong()      Stream -> LongStream  // these streams are called primitive streams
        * mapToDouble(ToLongFunction)    Stream -> DoubleStream
        *
        * IntStream
        * map()            IntStream -> IntStream
        * mapToLong(IntToLongFunction)      IntStream -> LongStream
        * mapToObj()       IntStream -> Stream
        *
        * LongStream
        * DoubleStream
        * */
        List<String> list = List.of("abcd","qwerty","asdfg");
        //To sum up the lengths of all the strings
        var result = list.stream().               // "abcd","qwerty","asdfg"
            mapToInt(s->s.length()).                  //  4, 6 , 5   Stream -> IntStream (and that has sum())
//            mapToObj(s->s).
                sum();                                //
        System.out.println(result);                   //

    }
}
