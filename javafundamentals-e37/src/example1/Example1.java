package example1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example1 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        var d2 = new ArrayDeque<>();
        ArrayDeque<Integer> d3 = new ArrayDeque<>();

        //stacks and queues

        //add element at the beginning
        //add element at the end
        //retrieve element from the beginning
        //retrieve element from the end
        //stack...LIFO
        //stacks have layers

//        d1.push(3); //push adds element at the beginning
//        d1.push(8);
//        d1.push(9);
//        d1.pop();
        //many methods in deque do the same thing
        d1.addFirst(3);
        d1.addFirst(8);
        d1.addFirst(9);
        d1.removeFirst();

//        d1.addLast(10);
//        d1.offer(12);
        //any collection in a Collections framework implements toString()
        d1.forEach(System.out::println);
    }
}
