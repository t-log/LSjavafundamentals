public class Example1 {
    /*
    * Creating your own class with generics
    * */
    public static void main(String[] args) {
        A<Integer> a1 = new A<>(); // java 7 , diamond operator
        A<Integer> a2 = new A<>(){
            //anonymous class works with Java 9 and not Java 8
        };

    }
}