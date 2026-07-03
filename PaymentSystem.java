
package vu.qn2exception;

/**
 *
 * @author USER
 */
public class PaymentSystem {
   
   private double balance = 10000;

    public void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }
}

    

