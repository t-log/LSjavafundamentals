package example3;

public class C<N extends Number>{ //setting boundaries
    void doSomething(N n){
        System.out.println(n.intValue());
    }
}
