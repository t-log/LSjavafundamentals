package main;
/*
* The order of resource closing
* opposite to resource instance creation
* */
public class Example2 {
    public static void main(String[] args) {
        try(R r1 = new R("r1");
            R r2 = new R("r2")){

        }
    }

}
