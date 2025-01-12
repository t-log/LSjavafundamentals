import exception.TooMuchMoneyException;

public class AccountController {
    private static final double MAX_AMOUNT = 100;
    public void withdraw(double amount) throws TooMuchMoneyException {
        if(amount > MAX_AMOUNT){
            throw new TooMuchMoneyException();
        }
    }
}
