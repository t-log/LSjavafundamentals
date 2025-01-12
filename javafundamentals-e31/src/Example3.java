public class Example3 {
    Bar<Integer> f1;
    Bar<?> f2; // any object wildcard
    Bar<? extends Number> f3;
    Bar<? super Number> f4;

    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.f1 = new Bar<Integer>();
//        obj.f1 = new Bar<String>(); // compilation problem
        obj.f3 = new Bar<Integer>();
        obj.f3 = new Bar<Double>();
//        obj.f3 = new Bar<Object>(); //compilation problem

        obj.f4 = new Bar<Number>();
        obj.f4 = new Bar<Object>();

        //Bar<Object> vs Bar<?>
        /* Bar<Object> will allow only types of Object whereas ? will allow any type*/
        Bar<Object> obj2 = new Bar<Object>();
//        Bar<Object> obj3 = new Bar<String>(); //compile issue
        Bar<?> obj4 = new Bar<Object>();
        Bar<?> obj5 = new Bar<String>();
    }
}
