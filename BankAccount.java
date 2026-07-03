
package vu.qn2exception;

/**
 *
 * @author USER
 */
public class BankAccount {
  

    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds.");
        }

        balance -= amount;
    }
}
    

