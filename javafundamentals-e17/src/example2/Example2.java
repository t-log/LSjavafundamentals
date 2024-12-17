package example2;

public class Example2 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        Cat c1 = new Cat();
        Animal a3 = c1;

        Cat c2 = (Cat) a2;
    }
}
