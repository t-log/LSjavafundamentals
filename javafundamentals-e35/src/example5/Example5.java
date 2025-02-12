package example5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example5 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(1000);
        set.add(10);
        set.add(300);
        set.add(256);
        set.forEach(System.out::println);
    }
}
