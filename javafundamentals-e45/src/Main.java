public class Main {
    /*
    * starting point of main thread
    *
    */
    public static void main(String[] args) {
        EvenNumbersThread t1 = new EvenNumbersThread();                                     //NEW
        t1.start(); // you want your thread here to begin execution           start vs run //RUNNABLE
//        t1.interrupt();
        System.out.println("END!" + Thread.currentThread().getName());
        // start vs run()
        //multiple timeline histories
        // END! 0 2 4 6 8 10             --> The most probable output
        // ...
        // 0 2 4 6 8 10 END!
    }
}
