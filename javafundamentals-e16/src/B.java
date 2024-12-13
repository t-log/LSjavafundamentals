public class B extends A{
    B(){
        super(50);
        System.out.println("constructor B");
    }
    B(int x){
        this();
        System.out.println("B 2");
    }
}
