package example2;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(10,20,50);
        Set<Integer> set2 = new HashSet<>();        // not ordered and not sorted
        Set<Integer> set3 = new LinkedHashSet<>();
        Set<Integer> set4 = new TreeSet<>();
        Set<Integer> set5 = List.of(10,20,30)
                .stream().collect(Collectors.toSet());

        // list                        vs                  set  (Set) / SortedSet / NavigableSet
        // ordered                                         not (not always) ordered
        // indexed                                         not indexed
        // do allow duplicates                             doesn't allow duplicates
    }
}
