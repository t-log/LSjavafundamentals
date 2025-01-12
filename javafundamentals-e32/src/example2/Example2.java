package example2;

public class Example2 {
    public static void main(String[] args) {
        //cannot use primitives for generics
        B<?> b1 = new B<>(10); //this works!?
        System.out.println(b1.a.getClass());
    }

}
