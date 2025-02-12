package example3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example3 {
    public static void main(String[] args) {
        //collection of associations (pairs)
        //(key, value)
        Map<Integer,String> m1 = new HashMap<>(); // (k,v) doesn't guarantee an order
        Map<Integer,String> m2 = new LinkedHashMap<>(); // (k,v) in the order in which you've added them
        Map<Integer,String> m3 = new TreeMap<>(); // (k,v) are sorted by their keys



    }
}
