package demo;

public class Example1 { // camel case
    public static void main(String[] args) {
        Cat c; // instance variable
        c = new Cat(); // instantiation
        var z = new Cat(); // Java 10 var is sort of a keyword
        c.name = "Tom";
        c.age = 10;
        z.name = "Billy";
        z.age = 15;
        System.out.println(c.name);
        System.out.println(c.age);
    }
}
