public class Example4 {
    public static void main(String[] args) {
        Bar<Number> b1 = new Bar<>();
        b1.y = 10; // by polymorphism this works

        //Bar<Number> b2 = new Bar<Integer>(); // this does not work in generics
        Bar<? extends Number> b3 = new Bar<Integer>();
        /*the above works but now the below does not work
        * only in the case of wildcard
        * */
//        b3.y = 10; // this now acts like a constant

        //why does this work here?
        /*
        * any class that has Number as child
        * */
        Bar<? super Number> b4 = new Bar<Number>(); //works by polymorphism
        b4.y = 20;
    }
}
