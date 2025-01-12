public class Main {
    //Generics Part-1
    /*
    * The problem :
    * At times you don't know the type of something (can be return type, attribute type , method parameter) from
    * the beginning. Only when class is instantiated or when a static method is called you come to know about the type.
    * How do you deal with such situations?
    * Before ~ Java 4 :
    * declare the attribute or whatever to an Object type and then cast it.
    * */
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.x = "Hello";
        Foo f2 = new Foo();
        f2.x = 2;

        int x = (int) f2.x; //casting
//        int y = (int) f1.x; //works at compile time but fails at runtime ClassCastException
        /*Solution: use generics
        *
        * */
        Bar<Integer> b1 = new Bar<>();
        b1.y = 3;
        //b1.y = (int)"hello"; //even casting won't work
        /*
        * Now we move errors from run-time to compile time with generics
        * */
    }
}