public class Example1 {
    public static void main(String[] args) {
        /*
        * Encapsulation and Inheritance
        * Encapsulation : Way of writing the class such that
        * you can't access the variable that represent the data directly
        * but indirectly through the behaviours of the instance
        * The way: make the variables private and use getters and setters
        * for booleans the getter starts with isMethod()
        *
        * add new fields
        * add new behaviour
        * change fields -> hiding fields
        * change behaviour -> overriding
        * */
        Cat c1 = new Cat();
        c1.name = "Tom";
        c1.age = 10; // direct access

        Square s1 = new Square();
        s1.area = ":)"; // hidden by child class
    }
}