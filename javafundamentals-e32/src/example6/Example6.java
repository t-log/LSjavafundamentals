package example6;

public class Example6 {
    public static void main(String[] args) {
        B<Integer> b1 = new B<>();
        b1.a = 10; // type of a is auto-assumed from B's generic type B
    }
}
