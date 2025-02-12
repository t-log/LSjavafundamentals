package example2;

import java.util.Comparator;
import java.util.TreeSet;

public class Example2 {
    //need for comparator when we need to compare based on different attributes of a class
    // also assume Dog can't be changed like its part of a library or you only have the binaries(only jars)
    //Comparable vs Comparator
    /*
    * Comparable<Dog> ->  int compareTo(Dog d)
    * Comparator<Dog>  ->  int compare(Dog d1, Dog d2)
    *
    * you can have mulitple comparators based on different class attributes to compare
    * */
    public static void main(String[] args) {
        Comparator<Dog> d = (d1,d2)-> d1.getAge() - d2.getAge();
        Comparator<Dog> cName = (d1,d2) -> d1.getName().compareTo(d2.getName());
        var set = new TreeSet<Dog>(d);

        set.add(new Dog(3,"A"));
        set.add(new Dog(2,"D"));
        set.add(new Dog(1,"C"));
        set.add(new Dog(6,"H"));
        set.add(new Dog(6,"F"));
        //if two of them have same age its a set so no duplicates
        //always implement comparator/comparable with equals and hashcode when using a set
        //and then use comparator based on the impl of equals and hashcode
        set.forEach(System.out::println);

        // Collections(class) vs Collection (interface)
    }
}
