package example8;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
    //Enhanced for loop
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(34); //2
        list.add(20);

//        list.remove(10); //IndexOutOfBounds Exception
        list.remove((Integer) 20);
        System.out.println(list);
    }
}
