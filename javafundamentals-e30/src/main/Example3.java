package main;

public class Example3 {
    /*The implicit finally will be invoked first*/
    public static void main(String[] args) {
        try(R r1 = new R("rrr")){

        }finally {
            System.out.println("brrrr");
        }
    }


}
