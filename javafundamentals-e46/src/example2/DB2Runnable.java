package example2;

public class DB2Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Querying DB2...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
