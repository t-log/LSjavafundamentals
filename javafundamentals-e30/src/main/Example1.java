package main;

public class Example1 {
    /*try with resources from Java 7
    * The problem : multiple try-catch creates confusion
    * */
    public static void main(String[] args){
        R r = null;
        /*
        try{

            r = new R();
        }catch (Exception e){

        }finally {
            if(r==null){
                try {
                    r.close();
                } catch (Exception e) {
                    System.out.println("handling...");
                }
            }
            System.out.println("inside finally");
        }
        */
        /*to avoid all these we use try with resources*/
        try(R r2 = new R("A")){ //compiler will create an implicit finally and call the close() to complete contract

        } catch (Exception e){

        }
    }

}
