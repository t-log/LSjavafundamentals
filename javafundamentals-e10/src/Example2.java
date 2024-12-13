public class Example2 {
    public static void main(String[] args) {
        final int [] x = {1,2,3,4,5};
        x[0]=20; // can be done because only the array reference x is final
        int [] [] y = {{1,2,3},{4,5},{6,7}};
        System.out.println(y.length);
        System.out.println(y[1].length);
    }
}
