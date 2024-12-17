package example1;

public class Example1 {
    public static void main(String[] args) {
        A a1 = new B();
        B b1 = (B) a1;
        /*with using a more general type (parent type as reference varialbe)
        * can only access what's available to that type (here the parent don't have acces to variable y)
        * */
        a1.x = 10;
        b1.x = ":)"; // field hiding

        /*in case of overriding it does not matter
        * The reference type does not matter
        * */
        a1.m();
        b1.m();
    }
}