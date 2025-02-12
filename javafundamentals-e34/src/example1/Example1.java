package example1;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        /*
        * java.util
        *
        * Collection<E> --- Map<K,V>
        *
        * List<E>, Set<E>, Deque<E>, Queue<E>
        *
        * List<E> ---> ArrayList<E>, LinkedList<E>
        *
        * Set<E> ---> HashSet<E> , LinkedHashSet<E>, TreeSet<E>
        *
        * Deque<E> ---> ArrayDeque<E>
        *
        * Map<K, V> ---> HashMap<K,V>, LinkedHashMap<K,V>, TreeMap<K,V>
        * concurrent lists will be discussed later
        * */
        /*
        * interface segregation - SOLID
        * liskov principle
        * */

        List<String> list1 = Arrays.asList("ABC","QWE","AAA");
        List<String> list2 = List.of("ABC","QWE","AAA");

        List<String> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();

        Collection<String> c1 = Arrays.asList("ABC","QWE","AAA");

        System.out.println(list1);

        String[] a1 = {"ABC","QWE","AAA"};
        System.out.println(a1);

        /*List can have duplicates
        * they are in order
        * */

    }
}
