// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// ATM class
class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance! Your balance is: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

// Main class
public class ATMApplication {
    public static void main(String[] args) {
        ATM atm = new ATM(5000); // Initial balance

        try {
            atm.deposit(2000);
            atm.withdraw(8000); // This will throw an exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
