public class Consumer extends Thread{
    public Consumer(String name){
        super(name);
    }
    @Override
    public void run(){ // C1[10]   C2[10]
        synchronized (Main.bucket){
            if(!Main.bucket.isEmpty()){
                int n = Main.bucket.get(0); //C1[10] --> runnable
                Main.bucket.remove(n);      //C2[10] --> runnable
                System.out.println(Thread.currentThread().getName()+
                        " took out "+n+" from the bucket");
            }
        }
    }
}
