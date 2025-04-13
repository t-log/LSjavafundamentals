package example2;

public class Example {
    public static void main(String[] args) {
        //1.query DB1 ---> 3 seconds
        //query DB2   ---> 2 seconds
        //max(3,2)    ---> 3 seconds

        //2.processing
        /*
        * query both db , one takes 3 secs and other 2 secs
        * if they are processed in parallel then we can save time
        * but it should be ensured the second step processing is executed only after 1.
        *
        * */

        DB1Runnable r1 = new DB1Runnable();
        DB2Runnable r2 = new DB2Runnable();
        Thread t1 = new Thread(r1,"T1");
        Thread t2 = new Thread(r2, "T2");
        t1.start();
        t2.start();
        try{
            t1.join(); // a synchronisation technique
            t2.join(); // both T1 and T2 are synchronised with main thread
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PROCESSING");
    }
}
