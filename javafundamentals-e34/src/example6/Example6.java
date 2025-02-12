package example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example6 {
    //Enhanced for loop
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(34); //2
        list.add(20);

//        for(Integer e : list){
//            System.out.println(e);
//        }
        Iterator<Integer> i = list.iterator(); // Iterator pattern in a separate stream
        while(i.hasNext()){
            Integer x = i.next(); // moves the iterator to the next value and returns it
            System.out.println(x);
        }
    }
}
