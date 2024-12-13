import java.util.Scanner;

public class Example_E_3_1 {
    public static void main(String[] args) {
        /*
        * ternary operator
        * condition is always evaluated as a boolean (true/false)
        * */
        boolean condition = false;
        int result = condition ? 10 : 20;
        System.out.println(result);

        int x = 10, y = 20;
        boolean result2 = x>y? true : false;
        System.out.println(result2);

        /*
        * get input from console
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("X:");
        int X = sc.nextInt();
        System.out.print("Y:");
        int Y = sc.nextInt();
        int result3 = X>Y? 50 : 100;
        System.out.println(result3);
    }
}