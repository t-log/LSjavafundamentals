package example4;

public class Example4 {
    public static void main(String[] args) {
        D<Integer,Number> d1 = new D<>();
        D<?,Number> d2 = new D<>();
        D<? extends Number,String> d3 = new D<>();
    }
}
