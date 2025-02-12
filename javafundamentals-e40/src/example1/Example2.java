package example1;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd","qwerty","asdfg");
        //To reverse all the strings
        list.stream().                                      // "abcd","qwerty","asdfg"
            map(s-> new StringBuilder(s).reverse()).        //  "dcba","ytrewq","gfdsa"
            forEach(s-> System.out.println(s));             //


    }
}
