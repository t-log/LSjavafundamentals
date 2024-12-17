package example3;

public class Foo implements A,B{
    @Override
    public void m() {
        A.super.m();
    }
}
