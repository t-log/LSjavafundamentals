package demo;

public class Cat { //rules for identifiers
    /*keywords in Java ~60
     *java is statically typed
     *
     */
    String name; // attribute
    int age; // primitive 4 bytes
    /*
    byte, short, int , long ,float, double, char , boolean
    */
    Cat(){
        System.out.println("a cat was created"); // if it is not specified there is a default one
    }
    void sayMeow(){
        System.out.println("Meow! My name is "+this.name); // this is used to refer the current instance
    }


}
