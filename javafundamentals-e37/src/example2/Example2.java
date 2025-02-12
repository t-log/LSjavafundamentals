package example2;

import java.util.ArrayDeque;

public class Example2 {
    public static void main(String[] args) {
        // Deque -> stack -> LIFO
        // Deque -> queue -> FIFO

        var d1 = new ArrayDeque<>(); // Like ArrayList , ArrayDeque is also backed by array

        //queue
        d1.offer(10);
        d1.pop();

        d1.push(10);
    }
}
