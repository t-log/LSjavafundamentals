public class Foo {
    /*static variable : cannot have local static variable
    * only inside a class and outside methods/blocks
    *
    * */
    int x;
    static int y; // does not belong to the instance of Foo
    static final int z = 10; //here we need to initialise it , can't initialise via constructor because its static
    public static void main(String[] args) {
//        static int x; //not allowed , static not allowed inside method
        Foo f1 = new Foo();
        f1.x=10;
        Foo f2 = new Foo();
        f2.x=20;
        System.out.println(f1.x);
        System.out.println(f2.x);
        Foo.y = 10;
        System.out.println(y);
    }
}
