package example4;

import java.util.HashSet;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // uses hashCode()
        set.add(10);
        set.add(1000);
        set.add(10);
        set.add(300);
        set.add(256);


    }
}
