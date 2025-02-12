package example2;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10); //0
        list.add(20); //1
        list.add(34); //2
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
    }
}
