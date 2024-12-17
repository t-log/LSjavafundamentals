package example1;

public class Example1 {
    public static void main(String[] args) {
        /*
        * Marker Interfaces : No methods declared in the contract Eg: Serializable interface
        * It's just to mark a characteristic of an object
        * If an object is of a particular type then do something with it. (As its marked we can achieve this)
        * This has now been replaced with Annotation in newer frameworks
        * */
        B b = new B();
        if(b instanceof A){
            System.out.println("Do some logic");
        }
    }
}