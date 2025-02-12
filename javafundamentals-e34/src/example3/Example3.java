package example3;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(34); //2
        list.add(20);
        Integer x = list.get(1);
        Integer y = list.get(4); //IndexOutOfBounds Exception
        System.out.println(x);
    }
}

