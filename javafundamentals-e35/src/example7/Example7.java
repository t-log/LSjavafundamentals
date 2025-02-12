package example7;

import java.util.HashSet;
import java.util.Set;

public class Example7 {
    public static void main(String[] args) {
        Set<Integer> set = getSomeSet();
        //here you cannot consider that they are sorted
        // Liskov principle
    }
    static Set<Integer> getSomeSet(){
        return new HashSet<>();
    }

}
