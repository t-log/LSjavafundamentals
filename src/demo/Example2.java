package demo;

public class Example2 {
    public static void main(String[] args) {
        /*
        * 1xyz - incorrect, xyz1-correct
        * x yz x=yz - incorrect
        * x_yz x$yz - correct
        *
        * */
        Cat c = new Cat();
        c.name="Phil";
        c.sayMeow();

        var x = new Cat();
        x.name = "Leo";
        x.sayMeow();
    }
}
