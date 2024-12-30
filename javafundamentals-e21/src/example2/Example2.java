package example2;

public class Example2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car.Engine e1 = c1.new Engine(); //tight coupling engine only exits when there's a car
        e1.run();
        e1.run();
        System.out.println(c1.getX());
    }
}
