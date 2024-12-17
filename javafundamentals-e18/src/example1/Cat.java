package example1;

public class Cat extends Pet{
    Cat(){
        super("Tom");
    }
    void sayMeow(){
        System.out.println("Meow! My name is "+this.name);
    }
}
