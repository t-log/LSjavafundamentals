public class Example2 {
    /*They are a compile time feature , it exists till source code , not the byte code.
    *
    *
    * */
    public static void main(String[] args) {
        Bar<Integer> b1 = new Bar<>();
        b1.y = 20;

        Bar<String> s1 = new Bar<>();
        s1.y = "Hello";


    }
}
