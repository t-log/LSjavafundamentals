import exception.MyCheckedException;
import exception.MyRuntimeException;
import exception.TooMuchMoneyException;

public class Main {
    //Managing Exceptions
    /*
    * Throwable
    *   Exception
    *       RunTimeException
    *   Error
    *       OutOfMemoryError
    *       StackOverflowError
    *
    * -> checked exception won't compile unless you treat them
    * -> unchecked exception (runtime) -> RunTimeException
    * checked and unchecked by whom? The compiler
    * */
    public static void main(String[] args)  {
        AccountController controller = new AccountController();
        try { //try-catch-finally
            controller.withdraw(1000);
        } catch (TooMuchMoneyException e) {
            System.out.println("Code to handle");
        }
        throw new MyRuntimeException();


    }
}