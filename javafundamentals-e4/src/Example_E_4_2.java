public class Example_E_4_2 {
    public static void main(String[] args) {
        /*comparison operators with references
        it will compare object addresses
         */
        Cat c1 = new Cat("Tom",10);
        Cat c2 = new Cat("Tom",10);
        boolean b = c1 == c2;
        System.out.println(b);

    }
}
class Cat{
    String name;
    int age;

    Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
}
