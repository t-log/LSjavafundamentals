public class Example1 {
    public static void main(String[] args) {
        /*varargs
        * rules:
        * should always be declared as the last argument and there should be only one vararg type in the parameter
        * list
        *
        * */
        m(1,2,3,4);
    }
    static void m(int... a){
        System.out.println(a[0]);
        for(int x : a){
            System.out.println(x);
        }
    }
}