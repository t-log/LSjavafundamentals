package example1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd","qwerty","asdfg");
        //To sum up the lengths of all the strings
        var result = list.stream().               // "abcd","qwerty","asdfg"
            map(s->s.length()).                          // 4,6,5
            reduce(0,(a,b)->a+b);                 // 0 + 4 , 4 + 6 , 10 + 5
        System.out.println(result);                      //15

    }
}
