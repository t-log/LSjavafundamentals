public class Cat {
    String name;

    Cat(){
        System.out.println("A cat was created!");
    }
    {
        System.out.println("inside anonymous block 1");
    }
    {
        System.out.println("inside anonymous block 2");
    }
    static{
        System.out.println("inside static block 1");
    }
    static{
        System.out.println("inside static block 2");
    }
    static void sayMeow(){
        System.out.println("Meow!");
    }
}
