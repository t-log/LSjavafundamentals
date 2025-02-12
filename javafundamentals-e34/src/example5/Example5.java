package example5;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    //Parsing an array list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(34); //2
        list.add(20);

        for(int i=0; i<list.size(); i++){
            Integer x = list.get(i);
            System.out.println(x);
        }
    }
}
