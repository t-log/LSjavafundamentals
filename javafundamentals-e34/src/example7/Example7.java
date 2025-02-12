package example7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example7 {
    //Enhanced for loop
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(34); //2
        list.add(20);

        //only java 8 and above
//        list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);
    }
}
