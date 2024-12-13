public class Example_E_3_7 {
    public static void main(String[] args) {
        /*
        *
        * */
        //version 12 and above (enhanced switch) and switch expressions (similar to ternary op)
        int x = 10;
        switch (x){
            case 10,11,20 -> System.out.println("inside case 10,11,12");
        }

        int y = switch(x){
            case 1 -> 10;
            default -> 20;
        };
    }
}