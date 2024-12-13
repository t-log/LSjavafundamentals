package example2;

public class B extends A{
    /*
    * you can return a sub-type as return type for overriding
    * */
    Integer m(){  //Integer extends Number so overriding is possible
        return 5;
    }
}
