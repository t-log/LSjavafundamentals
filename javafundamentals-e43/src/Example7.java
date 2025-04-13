import java.util.Optional;

public class Example7 {
    /* Optional Class
    * introduced in java 8
    *
    * */
    public static void main(String[] args) {
        //create an empty Optional
        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);
//        Optional<Integer> o3 = Optional.of(null); // be careful using factory of method don't pass null inside else
        //exception :(
//        Optional<String> o4 = Optional.of(m()); // exception here :(
        /*for the above cases use ofNullable()*/
        Optional<String> o5 = Optional.ofNullable(null); //it will be converted to Optional.empty() and won't cause
        //exception

        //methods related to Optional

        boolean b1 = o1.isPresent(); // will return false as o1 is empty
        boolean b2 = o2.isPresent(); // will return true
        System.out.println(b1);
        System.out.println(b2);

        o2.get(); //works only if the Optional is not empty..make sure of it!!! will throw exception so use with if
        //get() not recommended



    }
    static String m(){
       return null;
    }
}
