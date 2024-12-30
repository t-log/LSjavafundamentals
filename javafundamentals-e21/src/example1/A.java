package example1;

public class A {
    private int x;
    class A2{
        void m(){
            A.this.x = 10;
        }
    }
    static class A3{

    }
}
