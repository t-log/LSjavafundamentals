package example1;

import java.util.TreeSet;

public class Example1 {
    /*
    * Natural order :
    * When we have pre-defined types like Integer we have a natural order (i.e which is greater and smaller)
    * but for custom types (the classes which we create ourselves) we don't have one which needs to be specified
    *
    * */
    public static void main(String[] args) {
        /*
        * The below code fails because a tree-set is ordered and it does not know how to order an Object
        * of class Cat because we haven't specified one
        * */
        var set1 = new TreeSet<>(); //uses red-black tree internally
        set1.add(new Cat(4));
        set1.add(new Cat(1));
        set1.add(new Cat(6));
        set1.add(new Cat(2));

        set1.forEach(System.out::println);
    }
}
