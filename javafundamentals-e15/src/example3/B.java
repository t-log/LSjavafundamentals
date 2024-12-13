package example3;

public class B extends A {
    /*
    * you cannot use the access type more private than the parent overridden method
    * */
    protected Integer m(){  //Integer extends Number so overriding is possible
        return 5;
    }
}
