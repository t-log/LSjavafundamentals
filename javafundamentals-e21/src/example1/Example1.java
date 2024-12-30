package example1;

public class Example1 {
    public static void main(String[] args) {
        A.A3 a3 = new A.A3(); //static class
        A a = new A();
        A.A2 a2 = a.new A2(); // instance
    }
}
