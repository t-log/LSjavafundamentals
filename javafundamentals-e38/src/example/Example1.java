package example;

public class Example1{
    /*interfaces in java.util.function
    *
    * Recap : lambdas and functional interfaces
    * Make code shorter in some situations and eliminate boilerplate code
    * */
    public static void main(String[] args) {
        Eatable e1 = new Eatable() {
            @Override
            public void eat() {
                System.out.println("grub grub...");
            }
        };
        Eatable e2 = ()-> System.out.println("hap hap");
        e1.eat();
        e2.eat();
    }


}
