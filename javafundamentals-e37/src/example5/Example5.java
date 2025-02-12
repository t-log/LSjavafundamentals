package example5;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new TreeMap<>(Collections.reverseOrder());

        m1.put(10,"ABC");
        m1.put(20,"QWE");
        m1.put(10,"WWW");
        m1.put(30,"WWW");

        System.out.println(m1);

    }
}
