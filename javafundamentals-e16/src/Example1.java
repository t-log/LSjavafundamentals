public class Example1 {
    public static void main(String[] args) {
        /* Title : this , super and polymorphism
        *  both super() and this() should be the first instruction in constructor
        * */
        B b = new B(); // the parent constructor will also be called
        /*order : parent constructor then child*/

    }
}