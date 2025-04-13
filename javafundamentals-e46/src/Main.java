public class Main {
    public static void main(String[] args) {
        OddNumbersRunnable o1 = new OddNumbersRunnable();
        var t1 = new Thread(o1, "T1"); //NEW
        t1.start(); // NEW -> RUNNABLE
        System.out.println("END "+Thread.currentThread().getName());
        var t2 = new Thread(o1,"T2");
        t2.start();
    }
}
