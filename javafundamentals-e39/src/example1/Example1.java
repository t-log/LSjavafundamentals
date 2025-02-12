package example1;

import java.util.List;

public class Example1 {
    /*
    * Stream API makes code shorter and more maintainable
    * The bigger the code snippet the better if we re-write it using streams API to shorten code
    * */
    public static void main(String[] args) {
        //To get even numbers - the normal way
        List<Integer> list = List.of(2,3,5,8,11,13);

//        for(Integer i : list){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

        // The streams API way - Read it like poetry!
        list.stream()
            .filter(x->x%2==0)
            .forEach(System.out::println);

        //Visual understanding of streams API
        /*
        * There should be one source and a terminal operation
        * Source - can be a collection or something that generates elements
        * Terminal - stream won't be executed without one. After this stream won't be available
        *
        * */
    }
}
