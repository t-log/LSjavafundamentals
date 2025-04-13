package example2;

public class DB1Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Querying DB1...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
