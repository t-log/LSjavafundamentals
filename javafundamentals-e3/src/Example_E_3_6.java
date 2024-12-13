public class Example_E_3_6 {
    public static void main(String[] args) {
        /*
        * switch (decision control structure)
        * based on a value of a variable a decision (case) is executed
        * the decision variable can have values int / char / String / enum
        * if we use byte/short its auto-converted to int
        * */
        int x = 13;
        switch (x){
            case 1:
                System.out.println("inside case 1");
                break;
            case 10:
                System.out.println("inside case 10");
//                break;
            case 2:
                System.out.println("inside case 2");
            default: // not mandatory
                System.out.println("inside default");
        }
    }
}