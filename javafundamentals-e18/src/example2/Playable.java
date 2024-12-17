package example2;

public  interface Playable { //abstract
    /* defines a contract
    *  any method in an interface is public and abstract
    * */

    /*upto Java 7*/
    void play(); // public abstract
    public static final int x =10;

    /*with Java 8 we can have non-abstract methods as well as static methods*/
    public default void m(){

    }
    static void w(){

    }
    /*with Java 8/9 static methods can be private*/
    private static void p(){

    }
}
