package example2;

public class Car {
    private int x;

    public int getX(){
        return this.x;
    }
    class Engine{
        void run(){
            Car.this.x++;
        }
    }
}
