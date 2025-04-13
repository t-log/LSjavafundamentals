public class OddNumbersRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i+=1) {
            System.out.println(i +" " +Thread.currentThread().getName());
        }
    }
}
