public class Example5 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = b1 && m1(1);
        boolean b4 = b2 && m1(2); //due to short-circuit eval m1() is not called , not good SOLID
        boolean b5 = b1 & m1(3);
        boolean b6 = b2 & m1(4);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

    }
    static boolean m1(int i){
        System.out.println(i);
        return true;
    }
}
